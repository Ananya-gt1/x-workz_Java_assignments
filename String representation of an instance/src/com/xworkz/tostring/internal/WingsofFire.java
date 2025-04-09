package com.xworkz.tostring.internal;

public class WingsofFire {
    private String title;
    private String author;
    private int price;

    // Constructor
    public WingsofFire(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return
                "title=" + title +
                ", author=" + author +
                ", price=" + price
               ;
    }

}
