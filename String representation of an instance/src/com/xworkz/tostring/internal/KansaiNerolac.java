package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.PaintBrand;

public class KansaiNerolac extends PaintBrand {
    private String color;
    private String finishType;
    private int quantityInLiters;

    public KansaiNerolac(String color, String finishType, int quantityInLiters) {
        this.color = color;
        this.finishType = finishType;
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "Kansai Nerolac - Color: " + color +
                ", Finish: " + finishType +
                ", Quantity: " + quantityInLiters + "L";
    }
}
