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
}
