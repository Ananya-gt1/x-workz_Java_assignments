package com.xworkz.internal;

public class PoliticsProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in PoliticsProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in PoliticsProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in PoliticsProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in PoliticsProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in PoliticsProfessor...");
    }
}
