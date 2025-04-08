package com.xworkz.external;

import com.xworkz.internal.Phone;
import com.xworkz.internal.PhoneChild;

public class PhoneDisplay {
    public void display(Phone phone) {
        phone.call();
        phone.text();
        phone.takePhoto();
        phone.charge();
        phone.browse();
        
        if (phone instanceof PhoneChild) {
            PhoneChild phoneChild = (PhoneChild) phone;
            phoneChild.phoneSpecialAction();
        }
    }
}
