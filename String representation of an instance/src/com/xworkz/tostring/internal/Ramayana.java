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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 39;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Ramayana");
            Ramayana ramayana1 = this;
            Ramayana ramayana2 = (Ramayana) obj;
            if (ramayana1.author == ramayana2.author ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
