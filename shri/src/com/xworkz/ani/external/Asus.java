package com.xworkz.ani.external;

import com.xworkz.ani.internal.Laptop;



public class Asus {
    Laptop laptop;
    public Asus( Laptop laptop){
        this.laptop=laptop;
    }
    public  void execute(){
        if (laptop!=null){
            laptop.process();
        }
        else System.out.println("null method");
    }
}
