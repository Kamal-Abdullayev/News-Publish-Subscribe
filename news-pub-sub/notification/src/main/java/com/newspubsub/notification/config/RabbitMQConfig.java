package com.newspubsub.notification.config;

import com.newspubsub.notification.service.RabbitMQConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
public class RabbitMQConfig {
    @Value("${projectX.rabbitmq.q.news.today}")
    String queueTodayMessage;

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, RabbitMQConsumer rabbitMQConsumer) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queueTodayMessage);
        container.setMessageListener(new MessageListenerAdapter(rabbitMQConsumer));
        return container;
    }



}
