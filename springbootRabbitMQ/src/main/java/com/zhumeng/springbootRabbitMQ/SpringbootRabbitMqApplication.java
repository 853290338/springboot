package com.zhumeng.springbootRabbitMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 定时任务开启
public class SpringbootRabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRabbitMqApplication.class, args);
    }
}
