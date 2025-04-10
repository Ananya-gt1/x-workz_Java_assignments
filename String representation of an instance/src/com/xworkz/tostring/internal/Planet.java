package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.CelestialBody;

public class Planet extends CelestialBody {
    private String name;
    private double mass; // in kilograms
    private boolean hasLife;

    public Planet(String name, double mass, boolean hasLife) {
        this.name = name;
        this.mass = mass;
        this.hasLife = hasLife;
    }

    @Override
    public String toString() {
        return "Planet: " + name + ", Mass: " + mass + " kg, Has Life: " + hasLife;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 45;
    }
}
