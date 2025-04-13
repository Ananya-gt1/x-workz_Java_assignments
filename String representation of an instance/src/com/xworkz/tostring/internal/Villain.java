package com.xworkz.tostring.internal;

public class Villain {
    private String name;
    private int age;
    private String evilStyle;
    private String famousMovie;

    public Villain(String name, int age, String evilStyle, String famousMovie) {
        this.name = name;
        this.age = age;
        this.evilStyle = evilStyle;
        this.famousMovie = famousMovie;
    }

    @Override
    public String toString() {
        return "Villain: " + name + ", Age: " + age + ", Style: " + evilStyle + ", Famous For: " + famousMovie;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 14;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Villain");
            Villain villain1 = this;
            Villain villain2 = (Villain) obj;
            if (villain1.name == villain2.name ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
