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
            System.out.println("The reference is FishMeals");
            FishMeals fishMeals1 = this;
            FishMeals fishMeals2 = (FishMeals) obj;
            if (fishMeals1.fishType == fishMeals2.fishType && fishMeals1.region == fishMeals2.region && fishMeals1.isFried == fishMeals2.isFried) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
