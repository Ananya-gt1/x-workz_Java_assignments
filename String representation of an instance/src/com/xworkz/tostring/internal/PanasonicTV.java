package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Television;

public class PanasonicTV extends Television {
    private int screenSize;
    private boolean isSmartTV;
    private String resolution;

    public PanasonicTV(int screenSize, boolean isSmartTV, String resolution) {
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Panasonic TV - Screen: " + screenSize + " inch, Smart: " + isSmartTV + ", Resolution: " + resolution;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 48;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is PanasonicTV");
            PanasonicTV panasonicTV1 = this;
            PanasonicTV panasonicTV2 = (PanasonicTV) obj;
            if (panasonicTV1.screenSize == panasonicTV2.screenSize && panasonicTV1.isSmartTV == panasonicTV2.isSmartTV ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
