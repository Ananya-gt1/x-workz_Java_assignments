package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Car extends Vehicle {
    private String brand;
    private String model;
    private int price;

    // Constructor
    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return
                "brand=" + brand +
                ", model=" + model +
                ", price=" + price
                ;
    }
}
