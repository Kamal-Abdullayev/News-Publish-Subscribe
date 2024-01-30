package com.newspubsub.news.controller;

import com.newspubsub.news.dto.NewsCreateDto;
import com.newspubsub.news.dto.NewsResponseDto;
import com.newspubsub.news.dto.SubscriptionReqDto;
import com.newspubsub.news.model.NewsTopicsEnum;
import com.newspubsub.news.service.NewsService;
import com.newspubsub.news.service.NewsSubscriptionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    private final NewsService newsService;
    private final NewsSubscriptionService subscriptionService;

    @PostMapping("/subscribe")
    public ResponseEntity<HttpStatus> subscribe(@Valid @RequestBody SubscriptionReqDto request) {
        subscriptionService.subscribeToNews(request);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/topics")
    public ResponseEntity<List<NewsTopicsEnum>> interestedTopics(@Valid @RequestParam("email") String email) {
        return new ResponseEntity<>(subscriptionService.interestedTopics(email), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<NewsResponseDto> addNews(@Valid @RequestBody NewsCreateDto newsCreateDto) {
        return new ResponseEntity<>(newsService.addNews(newsCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/title")
    public ResponseEntity<List<NewsResponseDto>> getNewsByTitle(@Valid @RequestParam("title") String title, Pageable pageable) {
        return new ResponseEntity<>(newsService.getNewsByTitle(title, pageable), HttpStatus.OK);
    }

}
