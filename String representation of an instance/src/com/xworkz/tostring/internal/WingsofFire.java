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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is WingsofFire");
            WingsofFire wingsofFire1 = this;
            WingsofFire wingsofFire2 = (WingsofFire) obj;
            if (wingsofFire1.title == wingsofFire2.title ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
