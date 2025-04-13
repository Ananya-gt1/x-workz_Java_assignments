package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Television;

public class VizioTV extends Television {
    private int screenSize;
    private boolean isSmartTV;
    private String resolution;

    public VizioTV(int screenSize, boolean isSmartTV, String resolution) {
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Vizio TV - Screen: " + screenSize + " inch, Smart: " + isSmartTV + ", Resolution: " + resolution;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 13;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is VizioTV");
            VizioTV vizioTV1 = this;
            VizioTV vizioTV2 = (VizioTV) obj;
            if (vizioTV1.screenSize == vizioTV2.screenSize ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
