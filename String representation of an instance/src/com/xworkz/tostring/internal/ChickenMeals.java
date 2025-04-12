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
