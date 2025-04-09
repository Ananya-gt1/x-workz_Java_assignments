package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Television;

public class LG extends Television {
    private String brand;
    private String screenType;
    private int price;

    // Constructor
    public LG(String brand, String screenType, int price) {
        this.brand = brand;
        this.screenType = screenType;
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return
                "brand=" + brand +
                ", screenType=" + screenType +
                ", price=" + price
               ;
    }
}
