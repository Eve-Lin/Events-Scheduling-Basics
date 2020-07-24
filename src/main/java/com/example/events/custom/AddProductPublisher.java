package com.example.events.custom;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AddProductPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public AddProductPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishedAddedProduct(String productId){
        AddProductEvent addProductEvent = new AddProductEvent(this, productId);
        this.applicationEventPublisher.publishEvent(addProductEvent);
    }
}
