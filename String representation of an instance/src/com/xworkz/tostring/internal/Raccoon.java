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
}
