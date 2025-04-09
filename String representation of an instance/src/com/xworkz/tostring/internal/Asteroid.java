package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.CelestialBody;

public class Asteroid extends CelestialBody {
    private String name;
    private double diameter; // in kilometers
    private String composition; // e.g., Iron, Carbon, Silicate

    // Constructor
    public Asteroid(String name, double diameter, String composition) {
        this.name = name;
        this.diameter = diameter;
        this.composition = composition;
    }

    // toString method
    @Override
    public String toString() {
        return "Asteroid: " + name + ", Diameter: " + diameter + " km, Composition: " + composition;
    }
}
