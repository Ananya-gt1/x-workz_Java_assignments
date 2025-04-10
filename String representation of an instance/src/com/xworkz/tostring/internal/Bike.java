package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Bike extends Vehicle {
    private String brand;
    private int engineCC;
    private boolean isElectric;

    public Bike(String brand, int engineCC, boolean isElectric) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Bike - Brand: " + brand + ", Engine: " + engineCC + "cc, Electric: " + isElectric;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 2;
    }
}
