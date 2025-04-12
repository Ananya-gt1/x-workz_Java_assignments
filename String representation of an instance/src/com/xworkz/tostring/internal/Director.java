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
