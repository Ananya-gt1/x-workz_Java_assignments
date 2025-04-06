package com.xworkz.internal;

public class ChemistryProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in ChemistryProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in ChemistryProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in ChemistryProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in ChemistryProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in ChemistryProfessor...");
    }
}
