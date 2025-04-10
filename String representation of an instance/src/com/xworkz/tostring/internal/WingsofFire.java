package com.xworkz.tostring.internal;

public class WingsofFire {
    private String title;
    private String author;
    private int price;

    public WingsofFire(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "title=" + title +
                ", author=" + author +
                ", price=" + price
               ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 12;
    }
}
