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
