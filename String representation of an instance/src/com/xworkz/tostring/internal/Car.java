package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Car extends Vehicle {
    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "brand=" + brand +
                ", model=" + model +
                ", price=" + price
                ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 94;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Car");
            Car car1 = this;
            Car car2 = (Car) obj;
            if (car1.brand == car2.brand && car1.model == car2.model && car1.price == car2.price) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
