package com.xworkz.external;

import com.xworkz.internal.Sofa;
import com.xworkz.internal.SofaChild;

public class SofaDisplay {
    public void display(Sofa sofa) {
        sofa.sit();
        sofa.recline();
        sofa.adjust();
        sofa.clean();
        sofa.move();
        
        if (sofa instanceof SofaChild) {
            SofaChild sofaChild = (SofaChild) sofa;
            sofaChild.sofaSpecialAction();
        }
    }
}
