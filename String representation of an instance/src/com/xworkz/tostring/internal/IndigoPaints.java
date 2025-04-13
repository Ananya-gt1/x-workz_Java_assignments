package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class IndigoPaints extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public IndigoPaints(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "Indigo Paints - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 67;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is IndigoPaints");
            IndigoPaints indigoPaints1 = this;
            IndigoPaints indigoPaints2 = (IndigoPaints) obj;
            if (indigoPaints1.color == indigoPaints2.color && indigoPaints1.finishType == indigoPaints2.finishType ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
