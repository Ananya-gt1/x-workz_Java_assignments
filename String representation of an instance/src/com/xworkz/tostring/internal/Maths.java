package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Maths extends Subject {
    private String subjectName;
    private String teacher;
    private int numberOfChapters;

    // Constructor
    public Maths(String subjectName, String teacher, int numberOfChapters) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.numberOfChapters = numberOfChapters;
    }

    // toString method
    @Override
    public String toString() {
        return "Subject: " + subjectName + ", Teacher: " + teacher + ", Chapters: " + numberOfChapters;
    }
}
