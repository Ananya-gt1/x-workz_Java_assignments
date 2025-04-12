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
            System.out.println("The reference is Airplane");
            Airplane airplane1 = this;
            Airplane airplane2 = (Airplane) obj;
            if (airplane1.airline == airplane2.airline && airplane1.passengerCapacity == airplane2.passengerCapacity && airplane1.isInternational == airplane2.isInternational) {
                System.out.println("The Air Plane are same.....");
                return true;
            }
        }
        return false;
    }
}
