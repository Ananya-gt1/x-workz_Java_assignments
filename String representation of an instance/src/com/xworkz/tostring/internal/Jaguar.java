package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Jaguar extends WildAnimal {
    private String region;
    private boolean isNocturnal;
    private int biteForce; // in PSI (pounds per square inch)

    // Constructor
    public Jaguar(String region, boolean isNocturnal, int biteForce) {
        this.region = region;
        this.isNocturnal = isNocturnal;
        this.biteForce = biteForce;
    }

    // toString method
    @Override
    public String toString() {
        return "Jaguar - Region: " + region + ", Nocturnal: " + isNocturnal + ", Bite Force: " + biteForce + " PSI";
    }
}
