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
            System.out.println("The reference is Poetry");
            Poetry poetry1 = this;
            Poetry poetry2 = (Poetry) obj;
            if (poetry1.title == poetry2.title && poetry1.poet == poetry2.poet ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
