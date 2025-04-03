package com.xworkz.projector.internal;

public class Material {
    private String name;


    public Material(String name) {
        this.name = name;

    }
    public String getName(String name){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public void showMaterialDetails() {
        System.out.println("Material Name: " + name );
    }
}
