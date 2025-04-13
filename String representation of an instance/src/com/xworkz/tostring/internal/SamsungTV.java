package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Television;

public class SamsungTV extends Television {
    private int screenSize;
    private boolean isSmartTV;
    private String resolution;

    public SamsungTV(int screenSize, boolean isSmartTV, String resolution) {
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Samsung TV - Screen: " + screenSize + " inch, Smart: " + isSmartTV + ", Resolution: " + resolution;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 35;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is SamsungTV");
            SamsungTV samsungTV1 = this;
            SamsungTV samsungTV2 = (SamsungTV) obj;
            if (samsungTV1.screenSize == samsungTV2.screenSize ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
