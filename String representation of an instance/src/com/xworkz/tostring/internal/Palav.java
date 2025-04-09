package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class Palav extends IndianFood {
    private String variety;
    private String mainIngredient;
    private boolean isVeg;

    // Constructor
    public Palav(String variety, String mainIngredient, boolean isVeg) {
        this.variety = variety;
        this.mainIngredient = mainIngredient;
        this.isVeg = isVeg;
    }

    // toString method
    @Override
    public String toString() {
        return "Palav - Variety: " + variety + ", Main Ingredient: " + mainIngredient + ", Vegetarian: " + isVeg;
    }
}
