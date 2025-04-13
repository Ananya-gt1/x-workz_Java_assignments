package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Television;

public class SonyTV extends Television {
    private int screenSize;
    private boolean isSmartTV;
    private String resolution;

    public SonyTV(int screenSize, boolean isSmartTV, String resolution) {
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Sony TV - Screen: " + screenSize + " inch, Smart: " + isSmartTV + ", Resolution: " + resolution;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 24;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is SonyTV");
            SonyTV sonyTV1 = this;
            SonyTV sonyTV2 = (SonyTV) obj;
            if (sonyTV1.screenSize == sonyTV2.screenSize ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
