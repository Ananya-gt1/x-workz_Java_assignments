package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Cow extends Animal {
    private String breed;
    private String color;
    private boolean givesMilk;

    public Cow(String breed, String color, boolean givesMilk) {
        this.breed = breed;
        this.color = color;
        this.givesMilk = givesMilk;
    }

    @Override
    public String toString() {
        return "Cow - Breed: " + breed + ", Color: " + color + ", Gives Milk: " + givesMilk;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 86;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Cow");
            Cow cow1 = this;
            Cow cow2 = (Cow) obj;
            if (cow1.breed == cow2.breed && cow1.color == cow2.color && cow1.givesMilk == cow2.givesMilk) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
