package com.antonsskafferi.kitchen;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderServiceImpl implements OrderService {
    private Dish dish;
    private Order order = new Order();

    OrderServiceImpl(){
        this.dish = order.getDishes();
    }

    public String getDishName() {
        return dish.name;
    }
}
