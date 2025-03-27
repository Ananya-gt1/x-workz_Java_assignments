package com.xworkz.projector.internal;

public class Button {
    private String shape;
    private Material material;

    public Button(String shape, Material material) {
        this.shape = shape;
        this.material = material;
    }

    public void showButton() {
        System.out.println("Button Shape: " + shape);
        if(material!=null) {
            material.showMaterialDetails();
        }
        System.out.println("The material is null");
    }
}
