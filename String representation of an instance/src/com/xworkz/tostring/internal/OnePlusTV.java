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
            System.out.println("The reference is Hero");
            Hero hero1 = this;
            Hero hero2 = (Hero) obj;
            if (hero1.name == hero2.name && hero1.age == hero2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
