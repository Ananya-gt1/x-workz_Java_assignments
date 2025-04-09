package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Spaceship extends Vehicle {
    private String name;
    private int capacity;
    private boolean isReusable;

    public Spaceship(String name, int capacity, boolean isReusable) {
        this.name = name;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Spaceship - Name: " + name + ", Capacity: " + capacity + ", Reusable: " + isReusable;
    }
}
