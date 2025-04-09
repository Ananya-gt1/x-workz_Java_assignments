package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class RotiCurry extends IndianFood {
    private String curryType;
    private int rotiCount;
    private boolean isSpicy;

    // Constructor
    public RotiCurry(String curryType, int rotiCount, boolean isSpicy) {
        this.curryType = curryType;
        this.rotiCount = rotiCount;
        this.isSpicy = isSpicy;
    }

    // toString method
    @Override
    public String toString() {
        return "Roti Curry - Curry Type: " + curryType + ", Roti Count: " + rotiCount + ", Spicy: " + isSpicy;
    }
}
