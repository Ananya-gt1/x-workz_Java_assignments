package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Geography extends Subject {
    private String focusArea;
    private boolean includesMapStudy;
    private int numberOfChapters;

    // Constructor
    public Geography(String focusArea, boolean includesMapStudy, int numberOfChapters) {
        this.focusArea = focusArea;
        this.includesMapStudy = includesMapStudy;
        this.numberOfChapters = numberOfChapters;
    }

    // toString method
    @Override
    public String toString() {
        return "Geography - Focus Area: " + focusArea +
                ", Includes Map Study: " + includesMapStudy +
                ", Chapters: " + numberOfChapters;
    }
}
