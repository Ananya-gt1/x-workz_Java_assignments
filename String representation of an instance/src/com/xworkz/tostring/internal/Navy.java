package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.DefenseForce;

public class Navy extends DefenseForce {
    private String country;
    private int ships;
    private String admiral;

    public Navy(String country, int ships, String admiral) {
        this.country = country;
        this.ships = ships;
        this.admiral = admiral;
    }

    @Override
    public String toString() {
        return "Navy of " + country + ", Ships: " + ships + ", Admiral: " + admiral;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 53;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Navy");
            Navy navy1 = this;
            Navy navy2 = (Navy) obj;
            if (navy1.country == navy2.country && navy1.ships == navy2.ships ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
