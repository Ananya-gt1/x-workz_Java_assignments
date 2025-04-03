package com.xworkz.projector.internal;

public class Wire {
    private Quality quality;
    private String type;

    public Wire(Quality quality, String type) {
        this.quality = quality;
        this.type = type;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showWire() {
        System.out.println("Wire Type: " + type);
        if(quality!=null) {
            quality.showQuality();
            quality.setBrightness(34);
            quality.setResolution("Bright");
        }else System.out.println("The quality is null");
    }
}
