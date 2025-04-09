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
}
