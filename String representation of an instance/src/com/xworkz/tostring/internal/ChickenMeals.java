package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class ChickenMeals extends IndianFood {
    private String dishName;
    private String style;
    private boolean isBoneless;

    public ChickenMeals(String dishName, String style, boolean isBoneless) {
        this.dishName = dishName;
        this.style = style;
        this.isBoneless = isBoneless;
    }

    @Override
    public String toString() {
        return "Chicken Meal - Dish: " + dishName + ", Style: " + style + ", Boneless: " + isBoneless;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 90;
    }
}
