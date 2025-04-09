package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Literature;

public class ShortPoem extends Literature {
    private String title;
    private String poet;
    private int lineCount;

    // Constructor
    public ShortPoem(String title, String poet, int lineCount) {
        this.title = title;
        this.poet = poet;
        this.lineCount = lineCount;
    }

    // toString method
    @Override
    public String toString() {
        return "Short Poem: \"" + title + "\", Poet: " + poet + ", Lines: " + lineCount;
    }
}
