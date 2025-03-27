package com.xworkz.wednesday;

public class Shoe {
    static final String brandName;
    private ShoeType type;

    public Shoe(ShoeType type){
        this.type=type;
    }



    static {
        System.out.println("running static block");
        brandName="NIKE";
    }

    public ShoeType getType() {
        return type;
    }

     void setType(ShoeType type) {
        this.type = type;
    }

}
