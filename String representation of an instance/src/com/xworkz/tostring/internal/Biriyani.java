package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class Biriyani extends IndianFood {
    private String type;
    private String origin;
    private boolean isSpicy;

    public Biriyani(String type, String origin, boolean isSpicy) {
        this.type = type;
        this.origin = origin;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return "Biriyani Type: " + type + ", Origin: " + origin + ", Spicy: " + isSpicy;
    }
}
