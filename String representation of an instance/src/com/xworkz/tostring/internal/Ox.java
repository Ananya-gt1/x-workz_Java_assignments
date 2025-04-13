package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Ox extends Animal {
    private String breed;
    private String color;
    private boolean usedForFarming;

    public Ox(String breed, String color, boolean usedForFarming) {
        this.breed = breed;
        this.color = color;
        this.usedForFarming = usedForFarming;
    }

    @Override
    public String toString() {
        return "Ox - Breed: " + breed + ", Color: " + color + ", Used for Farming: " + usedForFarming;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 50;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Hero");
            Hero hero1 = this;
            Hero hero2 = (Hero) obj;
            if (hero1.name == hero2.name && hero1.age == hero2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
