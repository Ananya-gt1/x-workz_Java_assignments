package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Course;

public class Java extends Course {
    private String courseName;
    private String instructor;
    private int durationInWeeks;

    // Constructor
    public Java(String courseName, String instructor, int durationInWeeks) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.durationInWeeks = durationInWeeks;
    }

    // toString method to display course info
    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Instructor: " + instructor + ", Duration: " + durationInWeeks + " weeks";
    }
}
