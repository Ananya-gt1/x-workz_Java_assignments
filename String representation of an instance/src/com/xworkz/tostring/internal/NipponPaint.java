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
}
