package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Ox extends Animal {
    private String breed;
    private String color;
    private boolean usedForFarming;

    // Constructor
    public Ox(String breed, String color, boolean usedForFarming) {
        this.breed = breed;
        this.color = color;
        this.usedForFarming = usedForFarming;
    }

    // toString method
    @Override
    public String toString() {
        return "Ox - Breed: " + breed + ", Color: " + color + ", Used for Farming: " + usedForFarming;
    }
}
