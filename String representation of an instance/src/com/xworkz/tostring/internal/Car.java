package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Car extends Vehicle {
    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "brand=" + brand +
                ", model=" + model +
                ", price=" + price
                ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 94;
    }
}
