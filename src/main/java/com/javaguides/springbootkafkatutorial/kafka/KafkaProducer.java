package com.javaguides.springbootkafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private KafkaTemplate kafkaTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    public KafkaProducer(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        kafkaTemplate.send("javaguides",message);
        LOGGER.info(String.format("Message send %s ",message));

    }
}
