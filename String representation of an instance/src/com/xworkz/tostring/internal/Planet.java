package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.CelestialBody;

public class Planet extends CelestialBody {
    private String name;
    private double mass; // in kilograms
    private boolean hasLife;

    public Planet(String name, double mass, boolean hasLife) {
        this.name = name;
        this.mass = mass;
        this.hasLife = hasLife;
    }

    @Override
    public String toString() {
        return "Planet: " + name + ", Mass: " + mass + " kg, Has Life: " + hasLife;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 45;
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
