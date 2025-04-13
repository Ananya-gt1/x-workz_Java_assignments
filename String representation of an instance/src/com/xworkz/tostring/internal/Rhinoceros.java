package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Rhinoceros extends WildAnimal {
    private String species;
    private int hornCount;
    private boolean isEndangered;

    public Rhinoceros(String species, int hornCount, boolean isEndangered) {
        this.species = species;
        this.hornCount = hornCount;
        this.isEndangered = isEndangered;
    }

    @Override
    public String toString() {
        return "Rhinoceros - Species: " + species + ", Horn Count: " + hornCount + ", Endangered: " + isEndangered;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 37;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Rhinoceros");
            Rhinoceros rhinoceros1 = this;
            Rhinoceros rhinoceros2 = (Rhinoceros) obj;
            if (rhinoceros1.species == rhinoceros2.species ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
