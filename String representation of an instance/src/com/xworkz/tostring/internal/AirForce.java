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
        System.out.println("Original code:"+super.hashCode());
        return 10;;
    }
}
