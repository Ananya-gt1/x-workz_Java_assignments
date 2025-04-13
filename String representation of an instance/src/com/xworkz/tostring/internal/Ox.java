package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Ox extends Animal {
    private String breed;
    private String color;
    private boolean usedForFarming;

    public Ox(String breed, String color, boolean usedForFarming) {
        this.breed = breed;
        this.color = color;
        this.usedForFarming = usedForFarming;
    }

    @Override
    public String toString() {
        return "Ox - Breed: " + breed + ", Color: " + color + ", Used for Farming: " + usedForFarming;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 50;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Ox");
            Ox ox1 = this;
            Ox ox2 = (Ox) obj;
            if (ox1.breed == ox2.breed && ox1.color == ox2.color) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
