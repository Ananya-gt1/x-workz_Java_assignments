package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Literature;

public class ShortStory extends Literature {
    private String title;
    private String author;
    private int pageCount;

    public ShortStory(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Short Story: \"" + title + "\", Author: " + author + ", Pages: " + pageCount;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 29;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is ShortStory");
            ShortStory shortStory1 = this;
            ShortStory shortStory2 = (ShortStory) obj;
            if (shortStory1.title == shortStory2.title ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
