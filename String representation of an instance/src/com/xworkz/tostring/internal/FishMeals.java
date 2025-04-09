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
}
