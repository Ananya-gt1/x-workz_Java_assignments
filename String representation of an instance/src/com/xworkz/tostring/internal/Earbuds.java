package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Electronics;

public class Earbuds extends Electronics {
    private String name;
    private String brand;
    private int price;


    public Earbuds(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }


    @Override
    public String toString() {
        return
                "name=" + name +
                ", brand=" + brand +
                ", price=" + price
               ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 80;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Earbuds");
            Earbuds earbuds1 = this;
            Earbuds earbuds2 = (Earbuds) obj;
            if (earbuds1.name == earbuds2.name && earbuds1.brand == earbuds2.brand && earbuds1.price == earbuds2.price) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
