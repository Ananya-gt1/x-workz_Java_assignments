package com.xworkz.external;

import com.xworkz.internal.Router;
import com.xworkz.internal.RouterChild;

public class RouterDisplay {
    public void display(Router router) {
        router.connectInternet();
        router.reset();
        router.configure();
        router.turnOn();
        router.turnOff();
        
        if (router instanceof RouterChild) {
            RouterChild routerChild = (RouterChild) router;
            routerChild.routerSpecialAction();
        }
    }
}
