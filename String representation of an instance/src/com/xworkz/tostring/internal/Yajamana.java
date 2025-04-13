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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Yajamana");
            Yajamana yajamana1 = this;
            Yajamana yajamana2 = (Yajamana) obj;
            if (yajamana1.actorName == yajamana2.actorName ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
