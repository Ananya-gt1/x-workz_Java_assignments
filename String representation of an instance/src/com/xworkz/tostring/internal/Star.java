package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.CelestialBody;

public class Star extends CelestialBody {
    private String name;
    private double brightness; // in Luminosity (solar units)
    private String type;       // e.g., Red Giant, White Dwarf, Main Sequence

    public Star(String name, double brightness, String type) {
        this.name = name;
        this.brightness = brightness;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Star: " + name + ", Brightness: " + brightness + " L☉, Type: " + type;

    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 22;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Star");
            Star star1 = this;
            Star star2 = (Star) obj;
            if (star1.name == star2.name ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
