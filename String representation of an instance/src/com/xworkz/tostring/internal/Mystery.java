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
            System.out.println("The reference is Hero");
            Hero hero1 = this;
            Hero hero2 = (Hero) obj;
            if (hero1.name == hero2.name && hero1.age == hero2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
