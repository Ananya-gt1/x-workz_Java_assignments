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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Asianpaint");
            AsianPaint asianPaint1 = this;
            AsianPaint asianPaint2 = (AsianPaint) obj;
            if (asianPaint1.brand == asianPaint2.brand && asianPaint1.color == asianPaint2.color && asianPaint1.price == asianPaint2.price) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
