package com.xworkz.mock3.laptop;

public class Laptop {
    private String laptopName;
    private double price;
    private double quantity;

    public Laptop(String laptopName,double price,double quantity){
        this.laptopName=laptopName;
        this.price=price;
        this.quantity=quantity;
    }
    public String getLaptopName(){
        return laptopName;
    }
    public void display(){
        System.out.println(" Laptop Name:"+laptopName);
        System.out.println("Laptop Price:"+price);
        System.out.println("Laptop Quantity:"+quantity);
    }


}
