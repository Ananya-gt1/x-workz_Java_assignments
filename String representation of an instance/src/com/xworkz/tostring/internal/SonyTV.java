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
}
