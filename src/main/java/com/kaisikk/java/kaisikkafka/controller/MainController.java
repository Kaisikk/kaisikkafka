package com.kaisikk.java.kaisikkafka.controller;

import com.kaisikk.java.kaisikkafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/kafka/send")
    public String sendMessage(@RequestBody String message){
        kafkaProducer.sendMessage(message);
        return message;
    }

}
