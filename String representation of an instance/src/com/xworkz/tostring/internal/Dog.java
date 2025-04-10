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
}
