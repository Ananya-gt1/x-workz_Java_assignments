package com.xworkz.external;

import com.xworkz.internal.Bag;
import com.xworkz.internal.BagChild;
import com.xworkz.internal.Bed;

public class BagDisplay {
    public void display(Bag bag){
        bag.carry();
        bag.closeZip();
        bag.openZip();
        bag.pack();
        bag.unpack();

        if (bag instanceof BagChild){
            BagChild bagChild=(BagChild) bag;
        }
    }
}
