package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Tractor extends Vehicle {
    private String brand;
    private int horsepower;
    private boolean hasTrailer;

    public Tractor(String brand, int horsepower, boolean hasTrailer) {
        this.brand = brand;
        this.horsepower = horsepower;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return "Tractor - Brand: " + brand + ", HP: " + horsepower + ", Trailer: " + hasTrailer;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 17;
    }
}
