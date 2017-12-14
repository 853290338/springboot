package com.zhumeng.springbootRabbitMQ.test.maney;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "dp")
public class Receiver1 {

    @RabbitHandler
    public void process(String dp) {
        System.out.println("Receiver1  : " + dp);
    }
}
