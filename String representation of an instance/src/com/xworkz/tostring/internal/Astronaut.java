package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Human;

public class Astronaut extends Human {
    private String name;
    private int missions;
    private String agency; // e.g., NASA, ISRO, ESA

    public Astronaut(String name, int missions, String agency) {
        this.name = name;
        this.missions = missions;
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "Astronaut: " + name + ", Missions: " + missions + ", Agency: " + agency;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 5;
    }
}
