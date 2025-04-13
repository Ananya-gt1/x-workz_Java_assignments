package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Raccoon extends WildAnimal {
    private boolean hasMaskFace;
    private boolean isNocturnal;
    private String favoriteFood;

    public Raccoon(boolean hasMaskFace, boolean isNocturnal, String favoriteFood) {
        this.hasMaskFace = hasMaskFace;
        this.isNocturnal = isNocturnal;
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "Raccoon - Mask Face: " + hasMaskFace + ", Nocturnal: " + isNocturnal + ", Favorite Food: " + favoriteFood;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 40;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Raccoon");
            Raccoon raccoon1 = this;
            Raccoon raccoon2 = (Raccoon) obj;
            if (raccoon1.hasMaskFace == raccoon2.hasMaskFace ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
