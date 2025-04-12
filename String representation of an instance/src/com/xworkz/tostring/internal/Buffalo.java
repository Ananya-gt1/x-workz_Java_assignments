package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Buffalo extends Animal {
    private String breed;
    private double milkProduction; // in liters per day
    private boolean usedForPloughing;

    public Buffalo(String breed, double milkProduction, boolean usedForPloughing) {
        this.breed = breed;
        this.milkProduction = milkProduction;
        this.usedForPloughing = usedForPloughing;
    }

    @Override
    public String toString() {
        return "Buffalo - Breed: " + breed + ", Milk Production: " + milkProduction + " L/day, Used for Ploughing: " + usedForPloughing;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 96;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Airplane");
            Airplane airplane1 = this;
            Airplane airplane2 = (Airplane) obj;
            if (airplane1.airline == airplane2.airline && airplane1.passengerCapacity == airplane2.passengerCapacity && airplane1.isInternational == airplane2.isInternational) {
                System.out.println("The Air Plane are same.....");
                return true;
            }
        }
        return false;
    }
}
