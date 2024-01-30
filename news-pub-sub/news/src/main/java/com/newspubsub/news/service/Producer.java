package com.newspubsub.news.service;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Producer {
    private final RabbitTemplate rabbitTemplate;
    @Value("${projectX.rabbitmq.ex.news.message}")
    String exchangeNews;

    @Value("${projectX.rabbitmq.routingKey.news.today}")
    String routingKeyNewsToday;
    public void sendMessage() {

        for (int i = 1; i < 10; i++) {
            String message = "Hello  " + i;
            rabbitTemplate.convertAndSend(exchangeNews, routingKeyNewsToday, message);
        }
    }
}

