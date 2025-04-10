package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Python extends Animal {
    private String species;
    private double length; // meters
    private boolean isVenomous;

    public Python(String species, double length, boolean isVenomous) {
        this.species = species;
        this.length = length;
        this.isVenomous = isVenomous;
    }

    @Override
    public String toString() {
        return "Python - Species: " + species + ", Length: " + length + " m, Venomous: " + isVenomous;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 41;
    }
}
