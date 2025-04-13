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
            System.out.println("The reference is Dog");
            Dog dog1 = this;
            Dog dog2 = (Dog) obj;
            if (dog1.breed == dog2.breed && dog1.color == dog2.color && dog1.age == dog2.age) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
