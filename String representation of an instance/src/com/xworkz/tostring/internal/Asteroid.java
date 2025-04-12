package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.CelestialBody;

public class Asteroid extends CelestialBody {
    private String name;
    private double diameter; // in kilometers
    private String composition; // e.g., Iron, Carbon, Silicate

    public Asteroid(String name, double diameter, String composition) {
        this.name = name;
        this.diameter = diameter;
        this.composition = composition;
    }

    @Override
    public String toString() {
        return "Asteroid: " + name + ", Diameter: " + diameter + " km, Composition: " + composition;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 6;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Asteroid");
            Asteroid asteroid1 = this;
            Asteroid asteroid2 = (Asteroid) obj;
            if (asteroid1.name == asteroid2.name && asteroid1.diameter == asteroid2.diameter && asteroid1.composition == asteroid2.composition) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
