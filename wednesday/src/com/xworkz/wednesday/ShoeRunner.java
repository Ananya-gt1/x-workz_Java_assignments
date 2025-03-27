package com.xworkz.wednesday;

public class ShoeRunner {
    public static void main(String[] args) {
        System.out.println("running main ");
        System.out.println(Shoe.brandName);
        Shoe shoe=new Shoe(ShoeType.FORMALS);
        shoe.setType(ShoeType.SNEKERS);
        System.out.println(shoe.getType());
    }
}
