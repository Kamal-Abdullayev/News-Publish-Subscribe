package com.newspubsub.news.service;

import com.newspubsub.news.dto.SubscriptionReqDto;
import com.newspubsub.news.model.NewsTopicsEnum;
import com.newspubsub.news.model.User;
import com.newspubsub.news.repository.NewsSubscriptionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class NewsSubscriptionService {

    private final NewsSubscriptionRepository subscriptionRepository;

    public void subscribeToNews(SubscriptionReqDto reqDto) {
        User news = new User(reqDto.name(), reqDto.surname(), String.valueOf(System.currentTimeMillis()), reqDto.email(), true, reqDto.newsTopicList());
        log.info("User with {} email subscribed", news.getEmail());
        subscriptionRepository.save(news);
    }

    public List<NewsTopicsEnum> interestedTopics(String email) {
        User user = subscriptionRepository.findUserByEmail(email).orElseThrow();
        if (!user.isSubscribed()) return new ArrayList<>();
        return user.getNewsTopicEnums();
    }
}
