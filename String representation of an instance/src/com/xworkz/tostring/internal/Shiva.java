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
}
