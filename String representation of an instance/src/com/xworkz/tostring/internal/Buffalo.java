package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Buffalo extends Animal {
    private String breed;
    private double milkProduction; // in liters per day
    private boolean usedForPloughing;

    // Constructor
    public Buffalo(String breed, double milkProduction, boolean usedForPloughing) {
        this.breed = breed;
        this.milkProduction = milkProduction;
        this.usedForPloughing = usedForPloughing;
    }

    // toString method
    @Override
    public String toString() {
        return "Buffalo - Breed: " + breed + ", Milk Production: " + milkProduction + " L/day, Used for Ploughing: " + usedForPloughing;
    }
}
