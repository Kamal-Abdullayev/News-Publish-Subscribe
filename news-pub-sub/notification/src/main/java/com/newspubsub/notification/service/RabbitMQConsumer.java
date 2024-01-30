package com.newspubsub.notification.service;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer implements ChannelAwareMessageListener {

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        try {
            // Handle the received message
            String receivedMessage = new String(message.getBody());
            System.out.println("Received message: " + receivedMessage);
            // Simulate an error condition
            if (someErrorCondition()) {
                // Reject the message and request requeueing (true)
                channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
            } else {
                // Process the message and acknowledge it
                processMessage(receivedMessage);
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            }
        } catch (Exception e) {
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);
        }
    }

    private void processMessage(String message) {
        // Your message processing logic here
        System.out.println("Processing message: " + message);
    }

    private boolean someErrorCondition() {
        return true;
        // Simulate an error condition
//        return Math.random() < 0.1; // 10% chance of an error
    }
}