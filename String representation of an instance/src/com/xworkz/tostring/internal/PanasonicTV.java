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
}
