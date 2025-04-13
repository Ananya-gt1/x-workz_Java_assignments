package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class Palav extends IndianFood {
    private String variety;
    private String mainIngredient;
    private boolean isVeg;

    public Palav(String variety, String mainIngredient, boolean isVeg) {
        this.variety = variety;
        this.mainIngredient = mainIngredient;
        this.isVeg = isVeg;
    }

    @Override
    public String toString() {
        return "Palav - Variety: " + variety + ", Main Ingredient: " + mainIngredient + ", Vegetarian: " + isVeg;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 49;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Palav");
            Palav palav1 = this;
            Palav palav2 = (Palav) obj;
            if (palav1.variety == palav2.variety && palav1.mainIngredient == palav2.mainIngredient ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
