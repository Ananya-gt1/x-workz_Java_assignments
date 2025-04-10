package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Cinema;

public class Yajamana extends Cinema {
    private String actorName;
    private double cost;
    private float duration;

    public  Yajamana(String actorName,double cost,float duration)
    {
        this.actorName=actorName;
        this.cost=cost;
        this.duration=duration;
    }

    @Override
    public String toString() {
       return "Actor Name:"+this.actorName +" Cost:"+this.cost + "  Duration:"+this.duration;
    }

    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 11;
    }
}
