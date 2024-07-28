package com.hello.kafka101.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "interesting", groupId = "dev-team")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
