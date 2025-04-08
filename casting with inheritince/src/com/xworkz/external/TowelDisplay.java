package com.xworkz.external;

import com.xworkz.internal.Towel;
import com.xworkz.internal.TowelChild;

public class TowelDisplay {
    public void display(Towel towel) {
        towel.dryOff();
        towel.wash();
        towel.fold();
        towel.hang();
        towel.store();
        
        if (towel instanceof TowelChild) {
            TowelChild towelChild = (TowelChild) towel;
            towelChild.towelSpecialAction();
        }
    }
}
