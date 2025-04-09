package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Cow extends Animal {
    private String breed;
    private String color;
    private boolean givesMilk;

    // Constructor
    public Cow(String breed, String color, boolean givesMilk) {
        this.breed = breed;
        this.color = color;
        this.givesMilk = givesMilk;
    }

    // toString method
    @Override
    public String toString() {
        return "Cow - Breed: " + breed + ", Color: " + color + ", Gives Milk: " + givesMilk;
    }
}
