package com.xworkz.external;

import com.xworkz.internal.Comb;
import com.xworkz.internal.CombChild;

public class CombDisplay {
    public void display(Comb comb) {
        comb.combHair();
        comb.clean();
        comb.hold();
        comb.store();
        comb.untangle();
        
        if (comb instanceof CombChild) {
            CombChild combChild = (CombChild) comb;
            combChild.combSpecialAction();
        }
    }
}
