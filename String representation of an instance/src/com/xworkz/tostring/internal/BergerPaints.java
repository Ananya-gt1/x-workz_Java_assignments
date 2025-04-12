package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class BergerPaints extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public BergerPaints(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "Berger Paints - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 3;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is BergerPaints");
            BergerPaints bergerPaints1 = this;
            BergerPaints bergerPaints2 = (BergerPaints) obj;
            if (bergerPaints1.color == bergerPaints2.color && bergerPaints1.finishType == bergerPaints2.finishType && bergerPaints1.quantityInLiters == bergerPaints2.quantityInLiters) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
