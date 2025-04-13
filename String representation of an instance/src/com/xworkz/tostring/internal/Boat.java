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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Boat");
            Boat boat1 = this;
            Boat boat2 = (Boat) obj;
            if (boat1.type == boat2.type && boat1.capacity == boat2.capacity && boat1.isMotorized == boat2.isMotorized) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
