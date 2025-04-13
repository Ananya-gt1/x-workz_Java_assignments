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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 78;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Elephant");
            Elephant elephant1 = this;
            Elephant elephant2 = (Elephant) obj;
            if (elephant1.species == elephant2.species && elephant1.trunkLength == elephant2.trunkLength && elephant1.isDomesticated == elephant2.isDomesticated) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
