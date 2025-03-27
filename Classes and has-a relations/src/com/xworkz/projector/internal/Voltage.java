package com.xworkz.projector.internal;

public class Voltage {
    private int level;
    private String unit;

    public Voltage(int level,String unit){
        this.level=level;
        this.unit=unit;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void showVoltage() {
        System.out.println("Voltage Level: " + level + " " + unit);
    }
}
