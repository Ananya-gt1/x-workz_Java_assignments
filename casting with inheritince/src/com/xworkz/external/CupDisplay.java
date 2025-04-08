package com.xworkz.external;

import com.xworkz.internal.Cup;
import com.xworkz.internal.CupChild;

public class CupDisplay {
    public void display(Cup cup) {
        cup.fill();
        cup.drink();
        cup.pour();
        cup.clean();
        cup.place();
        
        if (cup instanceof CupChild) {
            CupChild cupChild = (CupChild) cup;
            cupChild.cupSpecialAction();
        }
    }
}
