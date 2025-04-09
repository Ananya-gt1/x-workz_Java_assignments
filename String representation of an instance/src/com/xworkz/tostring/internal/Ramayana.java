package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Epic;

public class Ramayana extends Epic {
    private String author;
    private String mainCharacter;
    private int numberOfChapters;

    public Ramayana(String author, String mainCharacter, int numberOfChapters) {
        this.author = author;
        this.mainCharacter = mainCharacter;
        this.numberOfChapters = numberOfChapters;
    }

    @Override
    public String toString() {
        return "Epic: Ramayana, Author: " + author + ", Main Character: " + mainCharacter + ", Chapters: " + numberOfChapters;
    }
}
