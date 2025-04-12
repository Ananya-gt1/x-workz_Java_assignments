package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Helicopter extends Vehicle {
    private String model;
    private int rotorBlades;
    private boolean isMilitary;

    public Helicopter(String model, int rotorBlades, boolean isMilitary) {
        this.model = model;
        this.rotorBlades = rotorBlades;
        this.isMilitary = isMilitary;
    }

    @Override
    public String toString() {
        return "Helicopter - Model: " + model + ", Blades: " + rotorBlades + ", Military: " + isMilitary;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 72;
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
