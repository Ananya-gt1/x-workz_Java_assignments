package com.xworkz.assignment3;

public class Minister {
    public String ministernName;
    int ministerAge;
    private String ministerState;
    public String primeministerName;
    int primeministerAge;
    private String primeministerState;
    public String mlaName;
    int mlaAge;
    private String mlaState;


  public  Minister(String name, int age,String state){
        this.name=name;
        this.age=age;
        this.state=state;
        this.primeministerName=primeministerName;
    }
    public void minister(){
        System.out.println("Public method \nName:"+this.name+", Age:"+this.age+", State:"+this.state);
        mla();
        primeMinister();
    }
    void primeMinister(){
        System.out.println("Default method \nName:"+this.name+", Age:"+this.age+", State:"+this.state);
    }
    private void mla(){
        System.out.println("Private method \nName:"+this.name+", Age:"+this.age+", State:"+this.state);
    }
}
