package com.xworkz.projector.internal;

public class Projector {

   private Len len;
   private Button button;
   private Battery battery;
   private Board board;
   private Capacitor capacitor;
   private Lamp lamp;
   private Material material;
   private Port port;
   private Quality quality;
   private Remote remote;
   private Voltage voltage;
   private Wire wire;
   private Warranty warranty;

   

    public void displayProjector() {
        len.setFocalLength(1);
        len.setType("convex");
        System.out.println("Projector Specifications:");
        len.showLens();
        lamp.setWattage(23);
        lamp.setBrand("life");
        lamp.showLamp();
        wire.setType("Straight");
        wire.showWire();
        warranty.setStartDate("23-04-2019");
        warranty.setEndDate("23-04-2025");
        warranty.showWatterny();
        voltage.setUnit("volt");
        voltage.setLevel(250);
        voltage.showVoltage();
        remote.setBrand("Live");
        remote.showRemote();
        quality.setBrightness(23);
        quality.setResolution("Bright");
        quality.showQuality();
        port.setPortType(PortType.DISPLAYPORT);
        port.setNumber(67);
        port.showPort();
        material.setName();
        material.showMaterialDetails();
        capacitor.setType("metal");
        capacitor.showCapacitor();
        battery.setType("watt");
        battery.showBattery();
        button.showButton();
        board.setMaterial("Aluminium");
        board.showBoard();

    }
}
