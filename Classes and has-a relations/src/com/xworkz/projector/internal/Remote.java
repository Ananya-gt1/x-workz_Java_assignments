package com.xworkz.projector.internal;

public class Remote {
    private String brand;
    private Battery battery;

    public Remote(String brand, Battery battery) {
        this.brand = brand;
        this.battery = battery;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void showRemote() {
        System.out.println("Remote Brand: " + brand);
        if(battery!=null) {
            battery.showBattery();
            battery.setType("U");
        }else System.out.println("The battery is Null");
    }
}
