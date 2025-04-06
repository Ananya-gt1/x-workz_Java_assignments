package com.xworkz.internal;

public class ComputerScienceProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in ComputerScienceProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in ComputerScienceProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in ComputerScienceProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in ComputerScienceProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in ComputerScienceProfessor...");
    }
}
