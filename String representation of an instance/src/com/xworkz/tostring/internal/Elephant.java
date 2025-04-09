package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Elephant extends WildAnimal {
    private String species;
    private double trunkLength; // in meters
    private boolean isDomesticated;

    public Elephant(String species, double trunkLength, boolean isDomesticated) {
        this.species = species;
        this.trunkLength = trunkLength;
        this.isDomesticated = isDomesticated;
    }

    @Override
    public String toString() {
        return "Elephant - Species: " + species + ", Trunk Length: " + trunkLength + " m, Domesticated: " + isDomesticated;
    }
}
