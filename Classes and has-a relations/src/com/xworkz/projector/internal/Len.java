package com.xworkz.projector.internal;

public class Len {
    private String type;
    private int focalLength;

    public Len(String type, int focalLength) {
        this.type = type;
        this.focalLength = focalLength;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }
    public void showLens()
    {
        System.out.println("Lens Type: " + type + ", Focal Length: " + focalLength);
    }
}
