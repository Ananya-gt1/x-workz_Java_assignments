package com.xworkz.ani.external;

import com.xworkz.ani.internal.Laptop;
import com.xworkz.ani.internal.TrafficRules;

public class PoliceDept {
    TrafficRules trafficRules;
    public PoliceDept( TrafficRules trafficRules){
        this.trafficRules=trafficRules;
    }
    public  void execute(){
        if (trafficRules!=null){
            trafficRules.rules();
        }
        else System.out.println("null method");
    }
}
