package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class AsianPaint extends PaintBrand {
    private String brand;
    private String color;
    private int price;


    public AsianPaint(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "brand=" + brand +
                ", color=" + color +
                ", price=" + price
               ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 7;
    }
}
