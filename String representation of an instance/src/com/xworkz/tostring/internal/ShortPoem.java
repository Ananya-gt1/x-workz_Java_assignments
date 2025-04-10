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
}
