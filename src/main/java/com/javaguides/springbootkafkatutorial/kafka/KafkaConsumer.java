package com.javaguides.springbootkafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    //private KafkaTemplate kafkaTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);


   /* public KafkaConsumer(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }*/

    @KafkaListener(topics = "javaguides" , groupId = "myGroup")
    public void Subscribe(String message){

 LOGGER.info(String.format("message received -> %s",message));

    }

}
