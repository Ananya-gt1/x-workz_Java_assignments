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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 62;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is KansaiNerolac");
            KansaiNerolac kansaiNerolac1 = this;
            KansaiNerolac kansaiNerolac2 = (KansaiNerolac) obj;
            if (kansaiNerolac1.color == kansaiNerolac2.color && kansaiNerolac1.finishType == kansaiNerolac2.finishType ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
