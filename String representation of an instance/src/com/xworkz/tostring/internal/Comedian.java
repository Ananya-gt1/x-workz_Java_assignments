package com.xworkz.tostring.internal;

public class Comedian {
    private String name;
    private int age;
    private String signatureStyle;
    private String popularMovie;

    public Comedian(String name, int age, String signatureStyle, String popularMovie) {
        this.name = name;
        this.age = age;
        this.signatureStyle = signatureStyle;
        this.popularMovie = popularMovie;
    }

    @Override
    public String toString() {
        return "Comedian: " + name + ", Age: " + age + ", Style: " + signatureStyle + ", Famous For: " + popularMovie;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 87;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Comedian");
            Comedian comedian1 = this;
            Comedian comedian2 = (Comedian) obj;
            if (comedian1.name == comedian2.name && comedian1.age == comedian2.age && comedian1.signatureStyle == comedian2.signatureStyle) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
