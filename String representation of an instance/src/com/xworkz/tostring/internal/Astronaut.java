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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Astronaut");
            Astronaut astronaut1 = this;
            Astronaut astronaut2 = (Astronaut) obj;
            if (astronaut1.name == astronaut2.name && astronaut1.missions == astronaut2.missions && astronaut1.agency == astronaut2.agency) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
