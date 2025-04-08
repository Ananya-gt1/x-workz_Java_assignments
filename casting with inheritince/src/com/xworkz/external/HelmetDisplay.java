package com.xworkz.external;

import com.xworkz.internal.Helmet;
import com.xworkz.internal.HelmetChild;

public class HelmetDisplay {
    public void display(Helmet helmet) {
        helmet.wear();
        helmet.adjustStrap();
        helmet.remove();
        helmet.clean();
        helmet.store();
        
        if (helmet instanceof HelmetChild) {
            HelmetChild helmetChild = (HelmetChild) helmet;
            helmetChild.helmetSpecialAction();
        }
    }
}
