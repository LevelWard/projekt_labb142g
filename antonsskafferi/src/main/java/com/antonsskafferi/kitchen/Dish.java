package com.antonsskafferi.kitchen;

import java.io.Serializable;

/**
 * A class just used to store and create dishes which is then used in a "Order"
 */
public final class Dish implements Serializable {
    public String name;
    public String notes;

    public Dish(String name, String notes){
        this.name = name;
        this.notes = notes;
    }

}
