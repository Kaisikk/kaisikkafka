package com.kaisikk.java.kaisikkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafkaTest", groupId = "my_consumer")
    public void listen (String message){
        System.out.println("Received message: " + message);
    }
}
