package com.example.events.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
     if("applicationBean".equals(beanName)){
         System.out.println("Before the bean is being initialized");
     }
     return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("applicationBean".equals(beanName)){
            System.out.println("After the bean is being initialized");
        }
        return bean;
    }
}
