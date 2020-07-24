package com.example.events.custom;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AddProductListener {

    @EventListener(AddProductEvent.class)
    public void onProductAdded(AddProductEvent addProductEvent){
        System.out.println(addProductEvent.toString());
    }

}
