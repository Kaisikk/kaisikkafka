package com.kaisikk.java.kaisikkafka.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic newTopic(){
        return new NewTopic(
                "kafkaTest",
                1,
                (short) 1
        );
    }

}
