package com.xworkz.assignment3;

public class Minister {
    public String name;
    int age;
    private String state;

  public  Minister(String name, int age,String state){
        this.name=name;
        this.age=age;
        this.state=state;
    }
    public void minister(){
        System.out.println("Name:"+this.name+", Age:"+this.age+", State:"+this.state);
    }
    void primeMinister(){
        System.out.println("Name:"+this.name+", Age:"+this.age+", State:"+this.state);
    }
    private void mla(){
        System.out.println("Name:"+this.name+", Age:"+this.age+", State:"+this.state);
    }
}
