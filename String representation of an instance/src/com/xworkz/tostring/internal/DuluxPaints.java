package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class DuluxPaints extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public DuluxPaints(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "Dulux Paints - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 82;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is DuluxPaints");
            DuluxPaints duluxPaints1 = this;
            DuluxPaints duluxPaints2 = (DuluxPaints) obj;
            if (duluxPaints1.color == duluxPaints2.color && duluxPaints1.finishType == duluxPaints2.finishType && duluxPaints1.quantityInLiters == duluxPaints2.quantityInLiters) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
