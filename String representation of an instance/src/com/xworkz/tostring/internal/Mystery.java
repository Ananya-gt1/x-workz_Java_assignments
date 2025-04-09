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
}
