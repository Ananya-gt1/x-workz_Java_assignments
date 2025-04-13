package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Cheetah extends WildAnimal {
    private double topSpeed; // in km/h
    private String continent;
    private boolean isSpotted;

    public Cheetah(double topSpeed, String continent, boolean isSpotted) {
        this.topSpeed = topSpeed;
        this.continent = continent;
        this.isSpotted = isSpotted;
    }

    @Override
    public String toString() {
        return "Cheetah - Top Speed: " + topSpeed + " km/h, Continent: " + continent + ", Spotted: " + isSpotted;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 92;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Cheetah");
            Cheetah cheetah1 = this;
            Cheetah cheetah2 = (Cheetah) obj;
            if (cheetah1.topSpeed == cheetah2.topSpeed && cheetah1.continent == cheetah2.continent && cheetah1.isSpotted == cheetah2.isSpotted) {
                System.out.println("The objects  are same.....");
                return true;
            }
        }
        return false;
    }
}
