package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.God;

public class Durga extends God {
    private String name;
    private String weapon;
    private String vehicle;
    private String knownFor;

    public Durga(String name, String weapon, String vehicle, String knownFor) {
        this.name = name;
        this.weapon = weapon;
        this.vehicle = vehicle;
        this.knownFor = knownFor;
    }

    @Override
    public String toString() {
        return "Goddess: " + name + ", Weapon: " + weapon + ", Vehicle: " + vehicle + ", Known For: " + knownFor;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 81;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Durga");
            Durga durga1 = this;
            Durga durga2 = (Durga) obj;
            if (durga1.name == durga2.name && durga1.weapon == durga2.weapon && durga1.vehicle == durga2.vehicle) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
