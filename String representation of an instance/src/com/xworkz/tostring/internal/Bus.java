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
}
