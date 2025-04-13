package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Literature;

public class Poetry extends Literature {
    private String title;
    private String poet;
    private String style; // e.g., Haiku, Sonnet, Free Verse

    public Poetry(String title, String poet, String style) {
        this.title = title;
        this.poet = poet;
        this.style = style;
    }

    @Override
    public String toString() {
        return "Poetry Title: \"" + title + "\", Poet: " + poet + ", Style: " + style;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 44;
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
