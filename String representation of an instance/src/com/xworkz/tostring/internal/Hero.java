package com.xworkz.tostring.internal;

public class Hero {
    private String name;
    private int age;
    private String debutMovie;
    private String famousRole;

    public Hero(String name, int age, String debutMovie, String famousRole) {
        this.name = name;
        this.age = age;
        this.debutMovie = debutMovie;
        this.famousRole = famousRole;
    }

    @Override
    public String toString() {
        return "Hero: " + name + ", Age: " + age + ", Debut: " + debutMovie + ", Famous Role: " + famousRole;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 70;
    }
}
