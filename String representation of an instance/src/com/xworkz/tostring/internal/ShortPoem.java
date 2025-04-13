package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Literature;

public class ShortPoem extends Literature {
    private String title;
    private String poet;
    private int lineCount;

    public ShortPoem(String title, String poet, int lineCount) {
        this.title = title;
        this.poet = poet;
        this.lineCount = lineCount;
    }

    @Override
    public String toString() {
        return "Short Poem: \"" + title + "\", Poet: " + poet + ", Lines: " + lineCount;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 30;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is ShortPoem");
            ShortPoem shortPoem1 = this;
            ShortPoem shortPoem2 = (ShortPoem) obj;
            if (shortPoem1.title == shortPoem2.title ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
