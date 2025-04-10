package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Human;

public class Scientist extends Human {
    private String name;
    private String fieldOfStudy; // e.g., Physics, Biology, Computer Science
    private int numberOfDiscoveries;

    public Scientist(String name, String fieldOfStudy, int numberOfDiscoveries) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.numberOfDiscoveries = numberOfDiscoveries;
    }

    @Override
    public String toString() {
        return "Scientist: " + name + ", Field: " + fieldOfStudy + ", Discoveries: " + numberOfDiscoveries;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 34;
    }
}
