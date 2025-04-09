package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Human;

public class Scientist extends Human {
    private String name;
    private String fieldOfStudy; // e.g., Physics, Biology, Computer Science
    private int numberOfDiscoveries;

    // Constructor
    public Scientist(String name, String fieldOfStudy, int numberOfDiscoveries) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.numberOfDiscoveries = numberOfDiscoveries;
    }

    // toString method
    @Override
    public String toString() {
        return "Scientist: " + name + ", Field: " + fieldOfStudy + ", Discoveries: " + numberOfDiscoveries;
    }
}
