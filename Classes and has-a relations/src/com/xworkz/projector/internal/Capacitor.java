package com.xworkz.projector.internal;

public class Capacitor {
    private String type;

    public Capacitor(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showCapacitor() {
        System.out.println("Capacitor Type: " + type );
    }
}
