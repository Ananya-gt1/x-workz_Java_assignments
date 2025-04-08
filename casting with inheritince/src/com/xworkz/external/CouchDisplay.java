package com.xworkz.external;

import com.xworkz.internal.Couch;
import com.xworkz.internal.CouchChild;

public class CouchDisplay {
    public void display(Couch couch) {
        couch.sit();
        couch.recline();
        couch.foldOut();
        couch.clean();
        couch.move();
        
        if (couch instanceof CouchChild) {
            CouchChild couchChild = (CouchChild) couch;
            couchChild.couchSpecialAction();
        }
    }
}
