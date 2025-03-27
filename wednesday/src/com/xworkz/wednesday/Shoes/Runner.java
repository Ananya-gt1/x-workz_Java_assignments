package com.xworkz.wednesday.Shoes;

import com.xworkz.wednesday.Shoe;
import com.xworkz.wednesday.ShoeType;

public class Runner {
    public static void main(String[] args) {
        Shoe shoe=new Shoe(ShoeType.FORMALS);
        System.out.println(shoe.getType());
    }
}
