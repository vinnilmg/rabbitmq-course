package com.vinnilmg.consumer.rabbitmq.consumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static constants.RabbitMQConstants.QUEUE_PRODUCT_LOG;

@Slf4j
@Component
public class StringConsumer {

//    @RabbitListener(queues = {QUEUE_PRODUCT_LOG})
//    public void consumerLog(String message) {
//        log.info("Consumer received a message: {}", message);
//    }
}
