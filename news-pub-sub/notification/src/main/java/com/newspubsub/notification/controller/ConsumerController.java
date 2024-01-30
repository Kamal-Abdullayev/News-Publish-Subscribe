package com.newspubsub.notification.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerController {
//    @RabbitListener(queues = {"${projectX.rabbitmq.q.news.today}"})
//    public void consume(String message) {
//        log.info("Received message: {}", message);
//    }
}
