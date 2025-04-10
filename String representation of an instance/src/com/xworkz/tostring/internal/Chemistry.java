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
}
