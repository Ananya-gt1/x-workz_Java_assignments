package com.xworkz.external;

import com.xworkz.internal.Toaster;
import com.xworkz.internal.ToasterChild;

public class ToasterDisplay {
    public void display(Toaster toaster) {
        toaster.toast();
        toaster.insertBread();
        toaster.removeBread();
        toaster.clean();
        toaster.setTimer();
        
        if (toaster instanceof ToasterChild) {
            ToasterChild toasterChild = (ToasterChild) toaster;
            toasterChild.toasterSpecialAction();
        }
    }
}
