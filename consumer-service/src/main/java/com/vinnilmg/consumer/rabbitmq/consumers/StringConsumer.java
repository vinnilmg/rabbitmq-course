package com.vinnilmg.consumer.rabbitmq.consumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StringConsumer {

    @RabbitListener(queues = {"product.log"})
    public void consumerLog(String message) {
        log.info("[LOG] Consumer received a message: {}", message);
    }
}
