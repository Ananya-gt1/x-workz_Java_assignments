package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Chemistry extends Subject {
    private String branch;
    private boolean isLabRequired;
    private int numberOfChapters;

    // Constructor
    public Chemistry(String branch, boolean isLabRequired, int numberOfChapters) {
        this.branch = branch;
        this.isLabRequired = isLabRequired;
        this.numberOfChapters = numberOfChapters;
    }

    // toString method
    @Override
    public String toString() {
        return "Chemistry - Branch: " + branch +
                ", Lab Required: " + isLabRequired +
                ", Chapters: " + numberOfChapters;
    }
}
