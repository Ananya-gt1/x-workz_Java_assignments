package com.xworkz.internal;

public class MathProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in MathProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in MathProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in MathProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in MathProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in MathProfessor...");
    }
}
