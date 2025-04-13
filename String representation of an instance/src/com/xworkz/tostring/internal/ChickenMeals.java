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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Chicken meals");
            ChickenMeals chickenMeals1 = this;
            ChickenMeals chickenMeals2 = (ChickenMeals) obj;
            if (chickenMeals1.dishName == chickenMeals2.dishName && chickenMeals1.style == chickenMeals2.style && chickenMeals1.isBoneless == chickenMeals2.isBoneless) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
