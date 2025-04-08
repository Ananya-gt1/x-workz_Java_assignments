package com.xworkz.external;

import com.xworkz.internal.Curtain;
import com.xworkz.internal.CurtainChild;

public class CurtainDisplay {
    public void display(Curtain curtain) {
        curtain.open();
        curtain.close();
        curtain.wash();
        curtain.hang();
        curtain.adjust();
        
        if (curtain instanceof CurtainChild) {
            CurtainChild curtainChild = (CurtainChild) curtain;
            curtainChild.curtainSpecialAction();
        }
    }
}
