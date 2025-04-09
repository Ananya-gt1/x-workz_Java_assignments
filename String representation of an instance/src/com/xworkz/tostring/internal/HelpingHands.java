package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.NGO;

public class HelpingHands extends NGO {
    private String name;
    private String location;
    private int volunteers;

    // Constructor
    public HelpingHands(String name, String location, int volunteers) {
        this.name = name;
        this.location = location;
        this.volunteers = volunteers;
    }

    // toString method to print NGO details
    @Override
    public String toString() {
        return "NGO Name: " + name + ", Location: " + location + ", Volunteers: " + volunteers;
    }
}
