package com.xworkz.assignment1;

public class Transport {
    String transportmode;
    public Transport(String transportmode){
        this.transportmode=transportmode;
    }
    void transportDisplay(){
        System.out.println("Transport Mode "+this.transportmode);
        System.out.println("----------------------------------------");
    }
}
