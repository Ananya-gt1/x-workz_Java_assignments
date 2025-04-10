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
}
