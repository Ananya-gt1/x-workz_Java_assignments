package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class RotiCurry extends IndianFood {
    private String curryType;
    private int rotiCount;
    private boolean isSpicy;

    public RotiCurry(String curryType, int rotiCount, boolean isSpicy) {
        this.curryType = curryType;
        this.rotiCount = rotiCount;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return "Roti Curry - Curry Type: " + curryType + ", Roti Count: " + rotiCount + ", Spicy: " + isSpicy;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 36;
    }
}
