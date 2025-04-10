package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class JSWPaints extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public JSWPaints(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "JSW Paints - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 63;
    }
}
