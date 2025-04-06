package com.xworkz.internal;

public class ScienceProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in ScienceProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in ScienceProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in ScienceProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in ScienceProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in ScienceProfessor...");
    }
}
