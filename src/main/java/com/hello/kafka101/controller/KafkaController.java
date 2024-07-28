package com.hello.kafka101.controller;

import com.hello.kafka101.producer.MessageProducer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.protocol.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qos")
public class KafkaController {

    @Autowired
    private MessageProducer producer;

    @PostMapping
    public void sendMessage(String message) {
        producer.sendMessage("interesting", message);
    }
}
