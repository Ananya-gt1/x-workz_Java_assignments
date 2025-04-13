package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Scooter extends Vehicle {
    private String brand;
    private boolean isElectric;
    private int topSpeed;

    public Scooter(String brand, boolean isElectric, int topSpeed) {
        this.brand = brand;
        this.isElectric = isElectric;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Scooter - Brand: " + brand + ", Electric: " + isElectric + ", Top Speed: " + topSpeed + " km/h";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 33;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Scooter");
            Scooter scooter1 = this;
            Scooter scooter2 = (Scooter) obj;
            if (scooter1.brand == scooter2.brand ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
