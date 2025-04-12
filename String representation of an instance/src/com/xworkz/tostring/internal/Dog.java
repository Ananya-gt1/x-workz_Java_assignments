package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Dog extends Animal {
    private String breed;
    private String color;
    private int age;

    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog - Breed: " + breed + ", Color: " + color + ", Age: " + age + " years";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 83;
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
