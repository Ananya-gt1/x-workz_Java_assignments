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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Crocodile");
            Crocodile crocodile1 = this;
            Crocodile crocodile2 = (Crocodile) obj;
            if (crocodile1.waterType == crocodile2.waterType && crocodile1.length == crocodile2.length && crocodile1.isAggressive == crocodile2.isAggressive) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
