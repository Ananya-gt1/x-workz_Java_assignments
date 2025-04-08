package com.xworkz.external;

import com.xworkz.internal.Watch;
import com.xworkz.internal.WatchChild;

public class WatchDisplay {
    public void display(Watch watch) {
        watch.showTime();
        watch.setAlarm();
        watch.startTimer();
        watch.stopwatch();
        watch.charge();
        
        if (watch instanceof WatchChild) {
            WatchChild watchChild = (WatchChild) watch;
            watchChild.watchSpecialAction();
        }
    }
}
