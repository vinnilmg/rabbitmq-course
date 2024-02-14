package com.vinnilmg.consumer.rabbitmq.consumers;

import dtos.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static constants.RabbitMQConstants.QUEUE_PRODUCT_LOG;

@Slf4j
@Component
public class ProductConsumer {

    @RabbitListener(queues = {QUEUE_PRODUCT_LOG})
    public void consumerLog(ProductDTO message) {
        log.info("Consumer received a new product: {}", message.toString());
    }
}
