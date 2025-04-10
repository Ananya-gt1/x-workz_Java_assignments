package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Jaguar extends WildAnimal {
    private String region;
    private boolean isNocturnal;
    private int biteForce; // in PSI (pounds per square inch)

    public Jaguar(String region, boolean isNocturnal, int biteForce) {
        this.region = region;
        this.isNocturnal = isNocturnal;
        this.biteForce = biteForce;
    }

    @Override
    public String toString() {
        return "Jaguar - Region: " + region + ", Nocturnal: " + isNocturnal + ", Bite Force: " + biteForce + " PSI";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 65;
    }
}
