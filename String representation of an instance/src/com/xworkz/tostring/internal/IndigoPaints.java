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
}
