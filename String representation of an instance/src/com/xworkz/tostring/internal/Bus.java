package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Bus extends Vehicle {
    private String operator;
    private int seatingCapacity;
    private boolean isAC;

    public Bus(String operator, int seatingCapacity, boolean isAC) {
        this.operator = operator;
        this.seatingCapacity = seatingCapacity;
        this.isAC = isAC;
    }

    @Override
    public String toString() {
        return "Bus - Operator: " + operator + ", Seats: " + seatingCapacity + ", AC: " + isAC;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 95;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Bus");
            Bus bus1 = this;
            Bus bus2 = (Bus) obj;
            if (bus1.operator == bus2.operator && bus1.seatingCapacity == bus2.seatingCapacity && bus1.isAC == bus2.isAC) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
