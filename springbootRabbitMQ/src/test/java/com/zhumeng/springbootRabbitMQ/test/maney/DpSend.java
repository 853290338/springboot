package com.zhumeng.springbootRabbitMQ.test.maney;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DpSend {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void dpSend(int i) {
        String context = "spirng boot neo queue" + " ****** " + i;
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("dp", context);
    }
}
