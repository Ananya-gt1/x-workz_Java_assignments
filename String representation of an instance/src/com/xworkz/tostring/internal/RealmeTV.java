package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Television;

public class RealmeTV extends Television {
    private int screenSize;
    private boolean isSmartTV;
    private String resolution;

    public RealmeTV(int screenSize, boolean isSmartTV, String resolution) {
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Realme TV - Screen: " + screenSize + " inch, Smart: " + isSmartTV + ", Resolution: " + resolution;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 38;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is RealmeTV");
            RealmeTV realmeTV1 = this;
            RealmeTV realmeTV2 = (RealmeTV) obj;
            if (realmeTV1.isSmartTV == realmeTV2.isSmartTV ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
