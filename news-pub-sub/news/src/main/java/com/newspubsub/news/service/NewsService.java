package com.newspubsub.news.service;

import com.newspubsub.news.dto.NewsCreateDto;
import com.newspubsub.news.dto.NewsResponseDto;
import com.newspubsub.news.dto.SendMailRequestDto;
import com.newspubsub.news.model.News;
import com.newspubsub.news.repository.NewsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Slf4j
@Service
public class NewsService {
    private final NewsRepository newsRepository;
    private final WebClient webClient;

    public NewsResponseDto addNews(NewsCreateDto newsCreateDto) {
        News news = new News(newsCreateDto.title(), newsCreateDto.content(), newsCreateDto.topic());
        newsRepository.save(news);
        return new NewsResponseDto(news.getTitle());
    }

    public List<NewsResponseDto> getNewsByTitle(String title, Pageable pageable) {
        return newsRepository.findAllByTitleContainingIgnoreCase(title, pageable)
                .stream()
                .map(NewsResponseDto::from)
                .collect(Collectors.toList());
    }

    public List<String> getLatestNewsId() {
        return newsRepository.findAllWithDateAfter(LocalDateTime.now().minusHours(3));
    }

    public void sendEmail(String email) {
        List<String> newsList = getLatestNewsId();
        SendMailRequestDto requestDto = new SendMailRequestDto(email);
        webClient.post()
                .uri("/send")
                .bodyValue(requestDto)
                .retrieve()
                .toBodilessEntity()
                .block();
        log.info("Content send to notification service");

    }
}
