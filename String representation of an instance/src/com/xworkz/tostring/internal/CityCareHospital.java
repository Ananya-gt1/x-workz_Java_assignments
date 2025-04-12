package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Hospital;

public class CityCareHospital extends Hospital {
    private String name;
    private String location;
    private int numberOfBeds;

    public CityCareHospital(String name, String location, int numberOfBeds) {
        this.name = name;
        this.location = location;
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", location=" + location +
                ", numberOfBeds=" + numberOfBeds
                ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 89;
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
