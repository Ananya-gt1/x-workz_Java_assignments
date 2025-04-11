package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Airplane extends Vehicle {
    private String airline;
    private int passengerCapacity;
    private boolean isInternational;

    public Airplane(String airline, int passengerCapacity, boolean isInternational) {
        this.airline = airline;
        this.passengerCapacity = passengerCapacity;
        this.isInternational = isInternational;
    }

    @Override
    public String toString() {
        return "Airplane - Airline: " + airline + ", Capacity: " + passengerCapacity + ", International: " + isInternational;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 9;
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
