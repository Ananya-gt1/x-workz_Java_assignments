package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Television;

public class LG extends Television {
    private String brand;
    private String screenType;
    private int price;

    public LG(String brand, String screenType, int price) {
        this.brand = brand;
        this.screenType = screenType;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "brand=" + brand +
                ", screenType=" + screenType +
                ", price=" + price
               ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 60;
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
