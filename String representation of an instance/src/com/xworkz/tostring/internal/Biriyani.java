package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class Biriyani extends IndianFood {
    private String type;
    private String origin;
    private boolean isSpicy;

    // Constructor
    public Biriyani(String type, String origin, boolean isSpicy) {
        this.type = type;
        this.origin = origin;
        this.isSpicy = isSpicy;
    }

    // toString method
    @Override
    public String toString() {
        return "Biriyani Type: " + type + ", Origin: " + origin + ", Spicy: " + isSpicy;
    }
}
