package com.antonsskafferi.kitchen;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class KitchenHandler{

    private String dishName;
    @Inject
    private OrderService orderService;

    @PostConstruct
    public void initialize(){
        this.dishName = orderService.getDishName();
    }

    public String getDishName() {
        return dishName;
    }
}
