package com.xworkz.abstraction.internal;

public abstract class Future {

    public Future(){
        System.out.println("The no argument constructor of Future......");
    }
    @Override
    public abstract void planning(){
        System.out.println("The abstract method of Planning in class Future...");
    }
}
