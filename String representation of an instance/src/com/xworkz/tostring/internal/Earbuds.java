package com.xworkz.tostring.internal;

public class Earbuds {
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
}
