package com.xworkz.external;

import com.xworkz.internal.Shoes;
import com.xworkz.internal.ShoesChild;

public class ShoesDisplay {
    public void display(Shoes shoes) {
        shoes.wear();
        shoes.tieLaces();
        shoes.walk();
        shoes.run();
        shoes.clean();
        
        if (shoes instanceof ShoesChild) {
            ShoesChild shoesChild = (ShoesChild) shoes;
            shoesChild.shoesSpecialAction();
        }
    }
}
