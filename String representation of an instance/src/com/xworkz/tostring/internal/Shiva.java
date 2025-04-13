package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.God;

public class Shiva extends God {
    private String name;
    private String weapon;
    private String vehicle;
    private String consort;

    public Shiva(String name, String weapon, String vehicle, String consort) {
        this.name = name;
        this.weapon = weapon;
        this.vehicle = vehicle;
        this.consort = consort;
    }

    @Override
    public String toString() {
        return "God: " + name + ", Weapon: " + weapon + ", Vehicle: " + vehicle + ", Consort: " + consort;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 31;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Shiva");
            Shiva shiva1 = this;
            Shiva shiva2 = (Shiva) obj;
            if (shiva1.name == shiva2.name ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
