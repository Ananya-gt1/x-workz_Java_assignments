package com.xworkz.external;

import com.xworkz.internal.Monitor;
import com.xworkz.internal.MonitorChild;

public class MonitorDisplay {
    public void display(Monitor monitor) {
        monitor.display();
        monitor.turnOn();
        monitor.turnOff();
        monitor.adjustBrightness();
        monitor.connect();
        
        if (monitor instanceof MonitorChild) {
            MonitorChild monitorChild = (MonitorChild) monitor;
            monitorChild.monitorSpecialAction();
        }
    }
}
