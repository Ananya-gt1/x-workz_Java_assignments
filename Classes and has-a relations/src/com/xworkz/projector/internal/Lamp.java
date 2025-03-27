package com.xworkz.projector.internal;

public class Lamp {
    private int wattage;
    private String brand;
    private Warranty warranty;

    public Lamp(int wattage, String brand, Warranty warranty) {
        this.wattage = wattage;
        this.brand = brand;
        this.warranty = warranty;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public void showLamp() {
        System.out.println("Lamp Brand: " + brand + ", Wattage: " + wattage);
        if(warranty!=null){
            warranty.showWatterny();
        }else System.out.println("The warranty is null");

    }
}
