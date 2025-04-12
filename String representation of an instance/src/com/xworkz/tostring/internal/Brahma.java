package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.God;

public class Brahma extends God {
    private String name;
    private int numberOfHeads;
    private String vehicle;
    private String consort;

    public Brahma(String name, int numberOfHeads, String vehicle, String consort) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.vehicle = vehicle;
        this.consort = consort;
    }

    @Override
    public String toString() {
        return "God: " + name + ", Heads: " + numberOfHeads + ", Vehicle: " + vehicle + ", Consort: " + consort;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 98;
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
