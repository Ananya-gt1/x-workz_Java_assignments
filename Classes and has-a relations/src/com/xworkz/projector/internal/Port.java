package com.xworkz.projector.internal;

public class Port {
    private PortType portType;
    private int number;

    public Port(PortType portType, int number) {
        this.portType = portType;
        this.number = number;
    }


    public PortType getPortType() {
        return portType;
    }

    public void setPortType(PortType portType) {
        this.portType = portType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void showPort() {
        System.out.println("Port Type: " + portType + ", Port Number: " + number);
    }
}
