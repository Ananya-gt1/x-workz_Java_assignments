package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Story;

public class Mystery extends Story {
    private String title;
    private String author;
    private int numberOfChapters;

    public Mystery(String title, String author, int numberOfChapters) {
        this.title = title;
        this.author = author;
        this.numberOfChapters = numberOfChapters;
    }

    @Override
    public String toString() {
        return "Mystery Story: \"" + title + "\", Author: " + author + ", Chapters: " + numberOfChapters;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 54;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Mystery");
            Mystery mystery1 = this;
            Mystery mystery2 = (Mystery) obj;
            if (mystery1.author == mystery2.author&& mystery1.numberOfChapters == mystery2.numberOfChapters ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
