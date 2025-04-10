package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Boat extends Vehicle {
    private String type; // e.g., "Sailing", "Motorboat"
    private int capacity;
    private boolean isMotorized;

    public Boat(String type, int capacity, boolean isMotorized) {
        this.type = type;
        this.capacity = capacity;
        this.isMotorized = isMotorized;
    }

    @Override
    public String toString() {
        return "Boat - Type: " + type + ", Capacity: " + capacity + ", Motorized: " + isMotorized;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 99;
    }
}
