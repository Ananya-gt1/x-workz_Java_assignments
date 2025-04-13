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
            System.out.println("The reference is HelpingHands");
            HelpingHands helpingHands1 = this;
            HelpingHands helpingHands2 = (HelpingHands) obj;
            if (helpingHands1.name == helpingHands2.name && helpingHands1.location == helpingHands2.location && helpingHands1.volunteers == helpingHands2.volunteers) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
