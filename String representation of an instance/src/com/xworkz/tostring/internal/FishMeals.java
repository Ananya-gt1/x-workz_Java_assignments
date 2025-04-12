package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class FishMeals extends IndianFood {
    private String fishType;
    private String region;
    private boolean isFried;

    public FishMeals(String fishType, String region, boolean isFried) {
        this.fishType = fishType;
        this.region = region;
        this.isFried = isFried;
    }

    @Override
    public String toString() {
        return "Fish Meal - Type: " + fishType + ", Region: " + region + ", Fried: " + isFried;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 74;
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
