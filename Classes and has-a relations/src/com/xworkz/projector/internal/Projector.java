package com.xworkz.projector.internal;

public class Projector {

    private Len lens = new Len("Convex", 50);

    private Lamp lamp = new Lamp(200, "Philips", new Warranty("2025-01-01", "2028-01-01"));
    private Wire wire = new Wire(new Quality("1080p", 3000), "HDMI");
    private Board board = new Board("Plastic",new Capacitor("Electrolytic"));
    private Button button = new Button("Circular", new Material("Royan"));
    private Port port=new Port(PortType.DISPLAYPORT,34);
    private Remote remote = new Remote("Sony",new Battery("AnyType",new Voltage(450,"High")));

    public void displayProjector() {
        System.out.println("Projector Specifications:");
        lens.showLens();
        lamp.showLamp();

        wire.showWire();
        board.showBoard();
        button.showButton();
        remote.showRemote();
    }
}
