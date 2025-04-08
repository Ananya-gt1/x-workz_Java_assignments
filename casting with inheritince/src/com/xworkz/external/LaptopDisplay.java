package com.xworkz.external;

import com.xworkz.internal.Laptop;
import com.xworkz.internal.LaptopChild;

public class LaptopDisplay {
    public void display(Laptop laptop) {
        laptop.boot();
        laptop.shutdown();
        laptop.runProgram();
        laptop.connectWifi();
        laptop.charge();
        
        if (laptop instanceof LaptopChild) {
            LaptopChild laptopChild = (LaptopChild) laptop;
            laptopChild.laptopSpecialAction();
        }
    }
}
