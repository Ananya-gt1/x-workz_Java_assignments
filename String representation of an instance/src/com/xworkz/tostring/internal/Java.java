package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Course;

public class Java extends Course {
    private String courseName;
    private String instructor;
    private int durationInWeeks;

    public Java(String courseName, String instructor, int durationInWeeks) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.durationInWeeks = durationInWeeks;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Instructor: " + instructor + ", Duration: " + durationInWeeks + " weeks";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 64;
    }
}
