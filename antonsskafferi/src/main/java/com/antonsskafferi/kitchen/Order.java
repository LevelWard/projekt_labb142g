package com.antonsskafferi.kitchen;

import java.io.Serializable;

/**
 * A class used to store a collection of "Dish" with functions that can be called by
 * the owning class
 */
public class Order implements Serializable {

    //Just an example, not a real implementation
    private Dish dishes;

    public Order(){
        this.dishes = new Dish("Noahs pasta", "Vill inte ha pasta");
    }

    public Dish getDishes() {
        return dishes;
    }
}
