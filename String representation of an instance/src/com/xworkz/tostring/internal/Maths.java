package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Maths extends Subject {
    private String subjectName;
    private String teacher;
    private int numberOfChapters;

    public Maths(String subjectName, String teacher, int numberOfChapters) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.numberOfChapters = numberOfChapters;
    }

    @Override
    public String toString() {
        return "Subject: " + subjectName + ", Teacher: " + teacher + ", Chapters: " + numberOfChapters;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 57;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Maths");
            Maths maths1 = this;
            Maths maths2 = (Maths) obj;
            if (maths1.subjectName == maths2.subjectName && maths1.teacher == maths2.teacher ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
