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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 80;
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
