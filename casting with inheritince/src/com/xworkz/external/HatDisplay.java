package com.xworkz.external;

import com.xworkz.internal.Hat;
import com.xworkz.internal.HatChild;

public class HatDisplay {
    public void display(Hat hat) {
        hat.wear();
        hat.remove();
        hat.adjust();
        hat.clean();
        hat.store();
        
        if (hat instanceof HatChild) {
            HatChild hatChild = (HatChild) hat;
            hatChild.hatSpecialAction();
        }
    }
}
