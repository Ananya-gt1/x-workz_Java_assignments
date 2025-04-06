package com.xworkz.internal;

public class EconomicsProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in EconomicsProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in EconomicsProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in EconomicsProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in EconomicsProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in EconomicsProfessor...");
    }
}
