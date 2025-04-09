package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Animal;

public class Dog extends Animal {
    private String breed;
    private String color;
    private int age;

    // Constructor
    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "Dog - Breed: " + breed + ", Color: " + color + ", Age: " + age + " years";
    }
}
