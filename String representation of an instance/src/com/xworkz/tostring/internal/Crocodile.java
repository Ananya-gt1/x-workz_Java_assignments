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
            System.out.println("The reference is Airplane");
            Airplane airplane1 = this;
            Airplane airplane2 = (Airplane) obj;
            if (airplane1.airline == airplane2.airline && airplane1.passengerCapacity == airplane2.passengerCapacity && airplane1.isInternational == airplane2.isInternational) {
                System.out.println("The Air Plane are same.....");
                return true;
            }
        }
        return false;
    }
}
