package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Tiger extends WildAnimal {
    private String species;
    private String habitat;
    private boolean isEndangered;

    // Constructor
    public Tiger(String species, String habitat, boolean isEndangered) {
        this.species = species;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    // toString method
    @Override
    public String toString() {
        return "Tiger - Species: " + species + ", Habitat: " + habitat + ", Endangered: " + isEndangered;
    }
}
