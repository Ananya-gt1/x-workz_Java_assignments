package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class BritishPaints extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public BritishPaints(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "British Paints - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 97;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("The reference is British paints");
            BritishPaints britishPaints1 = this;
            BritishPaints britishPaints2 = (BritishPaints) obj;
            if (britishPaints1.color == britishPaints2.color && britishPaints1.finishType == britishPaints2.finishType && britishPaints1.quantityInLiters == britishPaints2.quantityInLiters) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
