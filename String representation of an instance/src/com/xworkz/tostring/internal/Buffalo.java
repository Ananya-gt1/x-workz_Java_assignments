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
            System.out.println("The reference is Buffalo");
            Buffalo buffalo1 = this;
            Buffalo buffalo2 = (Buffalo) obj;
            if (buffalo1.breed == buffalo2.breed && buffalo1.milkProduction == buffalo2.milkProduction && buffalo1.usedForPloughing == buffalo2.usedForPloughing) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
