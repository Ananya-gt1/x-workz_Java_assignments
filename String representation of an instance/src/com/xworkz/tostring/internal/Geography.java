package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Geography extends Subject {
    private String focusArea;
    private boolean includesMapStudy;
    private int numberOfChapters;

    public Geography(String focusArea, boolean includesMapStudy, int numberOfChapters) {
        this.focusArea = focusArea;
        this.includesMapStudy = includesMapStudy;
        this.numberOfChapters = numberOfChapters;
    }

    @Override
    public String toString() {
        return "Geography - Focus Area: " + focusArea +
                ", Includes Map Study: " + includesMapStudy +
                ", Chapters: " + numberOfChapters;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 73;
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
