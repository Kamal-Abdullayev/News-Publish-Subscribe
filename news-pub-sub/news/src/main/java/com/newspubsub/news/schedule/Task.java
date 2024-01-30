package com.newspubsub.news.schedule;

import com.newspubsub.news.service.NewsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@RequiredArgsConstructor
@Configuration
@EnableScheduling
@Slf4j
public class Task {

    private final NewsService newsService;

//    @Async
//    @Scheduled(fixedDelay = 10000)
//    public void sendNotification() {
//        newsService.sendEmail("foj26171@zbock.com");
//    }
}
