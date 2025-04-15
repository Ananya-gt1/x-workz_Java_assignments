package com.xworkz.abstraction.internal;

public abstract class Shivam {
    private String actor;
    private double cost;
    private String actress;
    private String director;

    public Shivam(String actor,String actress){
        this.actor=actor;
        this.actress=actress;
    }
    public Shivam(String actor,String actress,String director){
        this(actor,actress);
        this.director=director;
    }
    public Shivam(String actor,String actress,String director,double cost){
        this(actor, actress, director);
        this.cost=cost;
    }
}
