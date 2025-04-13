package com.xworkz.tostring.internal;

public class Stuntman {
    private String name;
    private int age;
    private String specialty;
    private String famousMovie;

    public Stuntman(String name, int age, String specialty, String famousMovie) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
        this.famousMovie = famousMovie;
    }

    @Override
    public String toString() {
        return "Stuntman: " + name + ", Age: " + age + ", Specialty: " + specialty + ", Famous For: " + famousMovie;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 21;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Stuntman");
            Stuntman stuntman1 = this;
            Stuntman stuntman2 = (Stuntman) obj;
            if (stuntman1.name == stuntman2.name ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
