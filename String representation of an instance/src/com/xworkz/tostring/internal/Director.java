package com.xworkz.tostring.internal;

public class Director {
    private String name;
    private int age;
    private String directingStyle;
    private String famousMovie;

    public Director(String name, int age, String directingStyle, String famousMovie) {
        this.name = name;
        this.age = age;
        this.directingStyle = directingStyle;
        this.famousMovie = famousMovie;
    }

    @Override
    public String toString() {
        return "Director: " + name + ", Age: " + age + ", Style: " + directingStyle + ", Famous For: " + famousMovie;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 84;
    }
}
