package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Crocodile extends WildAnimal {
    private String waterType;
    private double length; // in meters
    private boolean isAggressive;

    public Crocodile(String waterType, double length, boolean isAggressive) {
        this.waterType = waterType;
        this.length = length;
        this.isAggressive = isAggressive;
    }

    @Override
    public String toString() {
        return "Crocodile - Water Type: " + waterType + ", Length: " + length + " m, Aggressive: " + isAggressive;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 85;
    }
}
