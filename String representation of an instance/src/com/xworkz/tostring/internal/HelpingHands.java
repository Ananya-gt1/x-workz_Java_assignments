package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.NGO;

public class HelpingHands extends NGO {
    private String name;
    private String location;
    private int volunteers;

    public HelpingHands(String name, String location, int volunteers) {
        this.name = name;
        this.location = location;
        this.volunteers = volunteers;
    }

    @Override
    public String toString() {
        return "NGO Name: " + name + ", Location: " + location + ", Volunteers: " + volunteers;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 71;
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
