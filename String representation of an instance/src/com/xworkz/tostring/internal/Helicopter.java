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
            System.out.println("The reference is Helicopter");
            Helicopter helicopter1 = this;
            Helicopter helicopter2 = (Helicopter) obj;
            if (helicopter1.model == helicopter2.model && helicopter1.rotorBlades == helicopter2.rotorBlades && helicopter1.isMilitary == helicopter2.isMilitary) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
