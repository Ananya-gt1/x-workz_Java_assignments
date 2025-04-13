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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 23;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Spaceship");
            Spaceship spaceship1 = this;
            Spaceship spaceship2 = (Spaceship) obj;
            if (spaceship1.name == spaceship2.name ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
