package com.zhumeng.springbootRabbitMQ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhumeng.springbootRabbitMQ.test.fanout.FanoutSender;
import com.zhumeng.springbootRabbitMQ.test.hello.Sender;
import com.zhumeng.springbootRabbitMQ.test.maney.DpSend;
import com.zhumeng.springbootRabbitMQ.test.maney.DpSend1;
import com.zhumeng.springbootRabbitMQ.test.topic.TopicSend;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitMqApplicationTests {

    @Autowired
    private Sender sender;

    @Autowired
    private DpSend dpSend;

    @Autowired
    private DpSend1 dpSend1;

    @Autowired
    private TopicSend send;

    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void contextLoads() {
        sender.send();
    }

    @Test
    public void oneToManey() {
        for (int i = 0; i < 10; i++) {
            dpSend1.dpSend(i);
        }
    }

    @Test
    public void maneyToManey() {
        for (int i = 0; i < 10; i++) {
            dpSend.dpSend(i);
            dpSend1.dpSend(i);
        }
    }

    @Test
    public void topicSend() {
        send.send1();
    }

    @Test
    public void topicSend2() {
        send.send2();
    }

    @Test
    public void fanoutSend() {
        fanoutSender.send();
    }
}
