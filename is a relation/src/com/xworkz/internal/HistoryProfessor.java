package com.xworkz.internal;

public class HistoryProfessor extends Professor{

    @Override
    public void teach() {
        System.out.println("Running Teach in HistoryProfessor...");
    }

    @Override
    public void research() {
        System.out.println("Running Research in HistoryProfessor...");
    }

    @Override
    public void evaluate() {
        System.out.println("Running Evaluate in HistoryProfessor...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Running Guide students in HistoryProfessor...");
    }

    @Override
    public void publishPapers() {
        System.out.println("Running Publish papers in HistoryProfessor...");
    }
}
