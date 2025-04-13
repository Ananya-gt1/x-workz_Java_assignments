package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Cat extends Animal {

    private String name;
    private String color;
    private double price;

    public Cat(String name,String color,double price)
    {
        this.color=color;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price
                ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 93;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Cat");
            Cat cat1 = this;
            Cat cat2 = (Cat) obj;
            if (cat1.name == cat2.name && cat1.color == cat2.color && cat1.price == cat2.price) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
