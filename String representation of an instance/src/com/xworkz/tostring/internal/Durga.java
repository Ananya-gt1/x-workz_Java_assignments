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
}
