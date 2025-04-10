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
}
