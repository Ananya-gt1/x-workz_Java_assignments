package com.xworkz.internal;

public class BiologyProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in BiologyProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in BiologyProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in BiologyProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in BiologyProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in BiologyProfessor...");
    }
}
