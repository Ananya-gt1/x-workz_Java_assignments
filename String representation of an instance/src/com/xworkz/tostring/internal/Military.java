package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Human;

public class Military extends Human {
    private String name;
    private String rank; // e.g., Captain, Major, Colonel
    private String unit; // e.g., Infantry, Air Force, Navy

    public Military(String name, String rank, String unit) {
        this.name = name;
        this.rank = rank;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Military Personnel: " + name + ", Rank: " + rank + ", Unit: " + unit;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 56;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Hero");
            Hero hero1 = this;
            Hero hero2 = (Hero) obj;
            if (hero1.name == hero2.name && hero1.age == hero2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
