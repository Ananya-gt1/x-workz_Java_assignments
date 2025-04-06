package com.xworkz.internal;

public class PhysicsProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in PhysicsProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in PhysicsProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in PhysicsProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in PhysicsProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in PhysicsProfessor...");
    }
}
