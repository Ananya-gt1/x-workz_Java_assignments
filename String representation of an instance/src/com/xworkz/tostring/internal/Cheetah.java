package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Cheetah extends WildAnimal {
    private double topSpeed; // in km/h
    private String continent;
    private boolean isSpotted;

    // Constructor
    public Cheetah(double topSpeed, String continent, boolean isSpotted) {
        this.topSpeed = topSpeed;
        this.continent = continent;
        this.isSpotted = isSpotted;
    }

    // toString method
    @Override
    public String toString() {
        return "Cheetah - Top Speed: " + topSpeed + " km/h, Continent: " + continent + ", Spotted: " + isSpotted;
    }
}
