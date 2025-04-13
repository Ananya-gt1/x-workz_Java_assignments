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
            System.out.println("The reference is Hospital");
            CityCareHospital cityCareHospital1 = this;
            CityCareHospital cityCareHospital2 = (CityCareHospital) obj;
            if (cityCareHospital1.name == cityCareHospital2.name && cityCareHospital1.location == cityCareHospital2.location && cityCareHospital1.numberOfBeds == cityCareHospital2.numberOfBeds) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
