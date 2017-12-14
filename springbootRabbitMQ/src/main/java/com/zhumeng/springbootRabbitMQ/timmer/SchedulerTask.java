package com.zhumeng.springbootRabbitMQ.timmer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {

    private int i = 0;

    @Scheduled(cron = "*/6 * * * * ?")
    private void procdss() {
        System.out.println("this is scheduler task runing  " + (i++));
    }
}
