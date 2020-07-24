package com.example.events.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
    int count =1;
//    @Scheduled(fixedRate = 1000)
//    @Scheduled(fixedDelay = 1000, initialDelay = 5000)
    public void doSomeWOrk(){

        System.out.println("Method called " + count + " times");
        count++;
    }

    //get executed at 02:00:00am, on every Sunday, every month
    @Scheduled(cron = "0 0 2 ?  * SUN")
    public void doOtherWork(){

    }
}
