package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class NipponPaint extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public NipponPaint(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "Nippon Paint - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 52;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is NipponPaint");
            NipponPaint nipponPaint1 = this;
            NipponPaint nipponPaint2 = (NipponPaint) obj;
            if (nipponPaint1.color == nipponPaint2.color && nipponPaint1.finishType == nipponPaint2.finishType ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
