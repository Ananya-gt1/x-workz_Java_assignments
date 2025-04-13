package com.xworkz.tostring.internal;

public class Heroine {
    private String name;
    private int age;
    private String debutMovie;
    private String popularRole;

    public Heroine(String name, int age, String debutMovie, String popularRole) {
        this.name = name;
        this.age = age;
        this.debutMovie = debutMovie;
        this.popularRole = popularRole;
    }

    @Override
    public String toString() {
        return "Heroine: " + name + ", Age: " + age + ", Debut: " + debutMovie + ", Popular Role: " + popularRole;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 69;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Heroine");
            Heroine heroine1 = this;
            Heroine heroine2 = (Heroine) obj;
            if (heroine1.name == heroine2.name && heroine1.age == heroine2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
