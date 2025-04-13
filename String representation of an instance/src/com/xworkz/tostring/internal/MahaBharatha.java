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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is MahaBharatha");
            MahaBharatha mahaBharatha1 = this;
            MahaBharatha mahaBharatha2 = (MahaBharatha) obj;
            if (mahaBharatha1.author == mahaBharatha2.author && mahaBharatha1.mainCharacter == mahaBharatha2.mainCharacter ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
