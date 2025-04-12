package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Chemistry extends Subject {
    private String branch;
    private boolean isLabRequired;
    private int numberOfChapters;

    public Chemistry(String branch, boolean isLabRequired, int numberOfChapters) {
        this.branch = branch;
        this.isLabRequired = isLabRequired;
        this.numberOfChapters = numberOfChapters;
    }

    @Override
    public String toString() {
        return "Chemistry - Branch: " + branch +
                ", Lab Required: " + isLabRequired +
                ", Chapters: " + numberOfChapters;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 91;
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
