package com.example.events.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ApplicationBean {

    @PostConstruct
    public void postConstructMethod(){
        System.out.println("After ApplicationBean has been constructed");
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("Before ApplicationBean is destroyed");
    }
}
