package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Literature;

public class ShortStory extends Literature {
    private String title;
    private String author;
    private int pageCount;

    // Constructor
    public ShortStory(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // toString method
    @Override
    public String toString() {
        return "Short Story: \"" + title + "\", Author: " + author + ", Pages: " + pageCount;
    }
}
