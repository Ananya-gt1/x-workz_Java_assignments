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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Bike");
            Bike bike1 = this;
            Bike bike2 = (Bike) obj;
            if (bike1.brand == bike2.brand && bike1.engineCC == bike2.engineCC && bike1.isElectric == bike2.isElectric) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
