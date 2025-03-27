package com.xworkz.projector.internal;

public class Board {
    private String material;
    private Capacitor capacitor;

    public Board(String material, Capacitor capacitor) {
        this.material = material;
        this.capacitor = capacitor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Capacitor getCapacitor() {
        return capacitor;
    }

    public void setCapacitor(Capacitor capacitor) {
        this.capacitor = capacitor;
    }

    public void showBoard() {
        System.out.println("Board Material: " + material);
        if(capacitor!=null) {
            capacitor.showCapacitor();
        }else System.out.println("The capacitor is null");
    }
}
