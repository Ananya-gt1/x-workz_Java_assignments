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
            System.out.println("The reference is Hero");
            Hero hero1 = this;
            Hero hero2 = (Hero) obj;
            if (hero1.name == hero2.name && hero1.age == hero2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
