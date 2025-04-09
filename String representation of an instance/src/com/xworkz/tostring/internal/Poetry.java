package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Literature;

public class Poetry extends Literature {
    private String title;
    private String poet;
    private String style; // e.g., Haiku, Sonnet, Free Verse

    // Constructor
    public Poetry(String title, String poet, String style) {
        this.title = title;
        this.poet = poet;
        this.style = style;
    }

    // toString method
    @Override
    public String toString() {
        return "Poetry Title: \"" + title + "\", Poet: " + poet + ", Style: " + style;
    }
}
