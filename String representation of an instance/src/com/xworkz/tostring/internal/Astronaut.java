package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Human;

public class Astronaut extends Human {
    private String name;
    private int missions;
    private String agency; // e.g., NASA, ISRO, ESA

    // Constructor
    public Astronaut(String name, int missions, String agency) {
        this.name = name;
        this.missions = missions;
        this.agency = agency;
    }

    // toString method
    @Override
    public String toString() {
        return "Astronaut: " + name + ", Missions: " + missions + ", Agency: " + agency;
    }
}
