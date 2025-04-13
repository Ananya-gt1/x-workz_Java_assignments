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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Python");
            Python python1 = this;
            Python python2 = (Python) obj;
            if (python1.species == python2.species&& python1.length == python2.length ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
