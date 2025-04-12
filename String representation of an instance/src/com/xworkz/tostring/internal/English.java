package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class English extends Subject {
    private String literatureType;
    private boolean grammarIncluded;
    private int chapterCount;

    public English(String literatureType, boolean grammarIncluded, int chapterCount) {
        this.literatureType = literatureType;
        this.grammarIncluded = grammarIncluded;
        this.chapterCount = chapterCount;
    }

    @Override
    public String toString() {
        return "English - Literature Type: " + literatureType +
                ", Grammar Included: " + grammarIncluded +
                ", Chapters: " + chapterCount;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 77;
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
