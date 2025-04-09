package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class English extends Subject {
    private String literatureType;
    private boolean grammarIncluded;
    private int chapterCount;

    // Constructor
    public English(String literatureType, boolean grammarIncluded, int chapterCount) {
        this.literatureType = literatureType;
        this.grammarIncluded = grammarIncluded;
        this.chapterCount = chapterCount;
    }

    // toString method
    @Override
    public String toString() {
        return "English - Literature Type: " + literatureType +
                ", Grammar Included: " + grammarIncluded +
                ", Chapters: " + chapterCount;
    }
}
