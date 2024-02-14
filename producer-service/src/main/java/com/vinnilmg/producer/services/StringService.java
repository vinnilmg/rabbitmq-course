package com.vinnilmg.producer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static com.vinnilmg.producer.configs.RabbitMQConfig.EXG_NAME_MARKETPLACE;
import static com.vinnilmg.producer.configs.RabbitMQConfig.RK_PRODUCT_LOG;

@Slf4j
@Service
@RequiredArgsConstructor
public class StringService {

    private final RabbitTemplate rabbitTemplate;

    public void produce(String message) {
        log.info("Received message: {}", message);
        rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, message);
    }

}
