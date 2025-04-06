package com.xworkz.internal;

public class EnglishProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in EnglishProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in EnglishProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in EnglishProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in EnglishProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in EnglishProfessor...");
    }
}
