package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Tiger extends WildAnimal {
    private String species;
    private String habitat;
    private boolean isEndangered;

    public Tiger(String species, String habitat, boolean isEndangered) {
        this.species = species;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    @Override
    public String toString() {
        return "Tiger - Species: " + species + ", Habitat: " + habitat + ", Endangered: " + isEndangered;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 18;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Tiger");
            Tiger tiger1 = this;
            Tiger tiger2 = (Tiger) obj;
            if (tiger1.species == tiger2.species) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
