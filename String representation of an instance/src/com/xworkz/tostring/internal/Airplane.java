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
}
