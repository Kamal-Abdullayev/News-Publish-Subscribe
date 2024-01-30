package com.newspubsub.news.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@EnableRabbit
@Configuration
public class RabbitMQConfig {
    @Value("${projectX.rabbitmq.q.news.today}")
    String queueTodayMessage;
    @Value("${projectX.rabbitmq.q.dlx.news.today}")
    String dlxQueueTodayMessage;

    @Value("${projectX.rabbitmq.ex.news.message}")
    String exchangeNews;
    @Value("${projectX.rabbitmq.ex.dlx.news.message}")
    String dlxExchangeNews;


    @Value("${projectX.rabbitmq.routingKey.news.today}")
    String routingKeyNewsToday;
    @Value("${projectX.rabbitmq.routingKey.news.today.retry}")
    String routingKeyNewsTodayRetry;


    @Bean
    Queue queueTodayMessage() {
        Map<String, Object> queueNewsMessageArguments = new HashMap<>();
        queueNewsMessageArguments.put("x-message-ttl", 5000);
        queueNewsMessageArguments.put("x-dead-letter-exchange", dlxExchangeNews);
        queueNewsMessageArguments.put("x-dead-letter-routing-key", routingKeyNewsTodayRetry);
        return new Queue(queueTodayMessage, true, false, false, queueNewsMessageArguments);
    }

    @Bean
    Queue dlxQueueTodayMessage() {
        Map<String, Object> queueNewsMessageArguments = new HashMap<>();
//        queueNewsMessageArguments.put("x-message-ttl", 10000);
//        queueNewsMessageArguments.put("x-dead-letter-exchange", exchangeNews);
//        queueNewsMessageArguments.put("x-dead-letter-routing-key", routingKeyNewsToday);
        return new Queue(dlxQueueTodayMessage, true, false, false, queueNewsMessageArguments);
    }

    @Bean
    DirectExchange exchangeNews() {
        return new DirectExchange(exchangeNews, true, false);
    }

    @Bean
    DirectExchange dlxExchangeNews() {
        return new DirectExchange(dlxExchangeNews, true, false);
    }

    @Bean
    Binding binding(Queue queueTodayMessage, DirectExchange exchangeNews) {
        return BindingBuilder.bind(queueTodayMessage).to(exchangeNews).with(routingKeyNewsToday);
    }

    @Bean
    Binding binding2(Queue dlxQueueTodayMessage, DirectExchange dlxExchangeNews) {
        return BindingBuilder.bind(dlxQueueTodayMessage).to(dlxExchangeNews).with(routingKeyNewsTodayRetry);
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queueTodayMessage);
        return container;
    }

    @Bean
    RabbitAdmin admin(RabbitTemplate rabbitTemplate) {
        return new RabbitAdmin(rabbitTemplate);
    }
}