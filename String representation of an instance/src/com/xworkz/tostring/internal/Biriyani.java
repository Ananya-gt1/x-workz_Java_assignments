package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.IndianFood;

public class Biriyani extends IndianFood {
    private String type;
    private String origin;
    private boolean isSpicy;

    public Biriyani(String type, String origin, boolean isSpicy) {
        this.type = type;
        this.origin = origin;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return "Biriyani Type: " + type + ", Origin: " + origin + ", Spicy: " + isSpicy;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 100;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Biriyani");
            Biriyani biriyani1 = this;
            Biriyani biriyani2 = (Biriyani) obj;
            if (biriyani1.type == biriyani2.type && biriyani1.origin.equals(biriyani2.origin) && biriyani1.isSpicy == biriyani2.isSpicy) {
                System.out.println("The objects are ....."+biriyani1.equals(biriyani2));
                return true;
            }
        }
        return false;
    }
}
