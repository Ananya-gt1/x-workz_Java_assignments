package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class ChickenMeals extends IndianFood {
    private String dishName;
    private String style;
    private boolean isBoneless;

    // Constructor
    public ChickenMeals(String dishName, String style, boolean isBoneless) {
        this.dishName = dishName;
        this.style = style;
        this.isBoneless = isBoneless;
    }

    // toString method
    @Override
    public String toString() {
        return "Chicken Meal - Dish: " + dishName + ", Style: " + style + ", Boneless: " + isBoneless;
    }
}
