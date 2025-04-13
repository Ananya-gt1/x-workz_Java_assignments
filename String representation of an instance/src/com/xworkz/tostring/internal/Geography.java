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
            System.out.println("The reference is Geography");
            Geography geography1 = this;
            Geography geography2 = (Geography) obj;
            if (geography1.focusArea == geography2.focusArea && geography1.includesMapStudy == geography2.includesMapStudy && geography1.numberOfChapters == geography2.numberOfChapters) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
