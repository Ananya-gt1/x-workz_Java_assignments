package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class ShalimarPaints extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public ShalimarPaints(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "Shalimar Paints - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 32;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is ShalimarPaints");
            ShalimarPaints shalimarPaints1 = this;
            ShalimarPaints shalimarPaints2 = (ShalimarPaints) obj;
            if (shalimarPaints1.color == shalimarPaints2.color ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
