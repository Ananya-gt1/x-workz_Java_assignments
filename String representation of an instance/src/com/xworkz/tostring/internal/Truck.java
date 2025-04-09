package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Truck extends Vehicle {
    private String company;
    private int loadCapacity; // in tons
    private boolean hasTrailer;

    public Truck(String company, int loadCapacity, boolean hasTrailer) {
        this.company = company;
        this.loadCapacity = loadCapacity;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return "Truck - Company: " + company + ", Load: " + loadCapacity + " tons, Trailer: " + hasTrailer;
    }
}
