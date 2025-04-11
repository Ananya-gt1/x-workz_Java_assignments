package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.DefenseForce;

public class AirForce extends DefenseForce {
    private String country;
    private int aircrafts;
    private String airChief;

    public AirForce(String country, int aircrafts, String airChief) {
        this.country = country;
        this.aircrafts = aircrafts;
        this.airChief = airChief;
    }

    @Override
    public String toString() {
        return "Air Force of " + country + ", Aircrafts: " + aircrafts + ", Air Chief: " + airChief;
    }

    @Override
    public int hashCode() {
        System.out.println("Original code:" + super.hashCode());
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("The object is not Null....");
        }
        if (obj instanceof AirForce) {
            System.out.println("The reference is AirForce");
            AirForce airForce1 = this;
            AirForce airForce2 = (AirForce) obj;
            if (airForce1.country == airForce2.country && airForce1.airChief == airForce2.airChief && airForce1.aircrafts == airForce2.aircrafts) {
                System.out.println("The Air Force are same.....");
                return true;
            }
        }
        return false;
    }
}

