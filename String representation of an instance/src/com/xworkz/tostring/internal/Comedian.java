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
