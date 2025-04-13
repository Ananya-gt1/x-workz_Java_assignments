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
            System.out.println("The reference is English");
            English english1 = this;
            English english2 = (English) obj;
            if (english1.literatureType == english2.literatureType && english1.grammarIncluded == english2.grammarIncluded && english1.chapterCount == english2.chapterCount) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
