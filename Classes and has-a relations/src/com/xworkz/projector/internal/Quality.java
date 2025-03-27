package com.xworkz.projector.internal;

public class Quality {
    private String resolution;
    private int brightness;

    public Quality(String resolution, int brightness) {
        this.resolution = resolution;
        this.brightness = brightness;
    }


    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void showQuality() {
        System.out.println("Resolution: " + resolution + ", Brightness: " + brightness + " lumens");
    }
}
