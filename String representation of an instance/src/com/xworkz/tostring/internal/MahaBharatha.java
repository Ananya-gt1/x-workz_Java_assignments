package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Epic;

public class MahaBharatha extends Epic {
    private String author;
    private String mainCharacter;
    private int numberOfVerses;

    public MahaBharatha(String author, String mainCharacter, int numberOfVerses) {
        this.author = author;
        this.mainCharacter = mainCharacter;
        this.numberOfVerses = numberOfVerses;
    }

    @Override
    public String toString() {
        return "Epic: Mahabharatha, Author: " + author + ", Main Character: " + mainCharacter + ", Verses: " + numberOfVerses;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 58;
    }
}
