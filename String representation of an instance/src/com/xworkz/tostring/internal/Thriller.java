package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Story;

public class Thriller extends Story {
    private String title;
    private String writer;
    private int suspenseLevel; // scale of 1 to 10

    public Thriller(String title, String writer, int suspenseLevel) {
        this.title = title;
        this.writer = writer;
        this.suspenseLevel = suspenseLevel;
    }

    @Override
    public String toString() {
        return "Thriller Story: \"" + title + "\", Writer: " + writer + ", Suspense Level: " + suspenseLevel + "/10";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 19;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Thriller");
            Thriller thriller1 = this;
            Thriller thriller2= (Thriller) obj;
            if (thriller1.title == thriller2.title ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
