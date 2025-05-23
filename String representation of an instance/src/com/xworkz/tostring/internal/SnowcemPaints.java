package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class SnowcemPaints extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public SnowcemPaints(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "Snowcem Paints - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 25;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is SnowcemPaints");
            SnowcemPaints snowcemPaints1 = this;
            SnowcemPaints snowcemPaints2 = (SnowcemPaints) obj;
            if (snowcemPaints1.color == snowcemPaints2.color ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
