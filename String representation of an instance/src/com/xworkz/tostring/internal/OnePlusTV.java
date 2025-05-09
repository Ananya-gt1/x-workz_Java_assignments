package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Television;

public class OnePlusTV extends Television {
    private int screenSize;
    private boolean isSmartTV;
    private String resolution;

    public OnePlusTV(int screenSize, boolean isSmartTV, String resolution) {
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "OnePlus TV - Screen: " + screenSize + " inch, Smart: " + isSmartTV + ", Resolution: " + resolution;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 51;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is OnePlusTV");
            OnePlusTV onePlusTV1 = this;
            OnePlusTV onePlusTV2 = (OnePlusTV) obj;
            if (onePlusTV1.screenSize == onePlusTV2.screenSize&& onePlusTV1.isSmartTV == onePlusTV2.isSmartTV ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
