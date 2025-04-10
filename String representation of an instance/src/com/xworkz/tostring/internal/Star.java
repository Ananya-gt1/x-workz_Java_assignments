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
}
