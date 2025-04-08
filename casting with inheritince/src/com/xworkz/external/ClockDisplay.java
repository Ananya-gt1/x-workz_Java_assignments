package com.xworkz.external;

import com.xworkz.internal.Clock;
import com.xworkz.internal.ClockChild;

public class ClockDisplay {
    public void display(Clock clock) {
        clock.showTime();
        clock.setAlarm();
        clock.tick();
        clock.chime();
        clock.reset();
        
        if (clock instanceof ClockChild) {
            ClockChild clockChild = (ClockChild) clock;
            clockChild.clockSpecialAction();
        }
    }
}
