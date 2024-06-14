package jiraya.dev.javacore.methodsintroduction.test;

import jiraya.dev.javacore.methodsintroduction.domain.Employer;

public class EmployerExercise {
    public static void main(String[] args) {
        Employer employer01 = new Employer("Jonatas", 21, new double[]{2500.00, 2522.50, 2499.80});

        employer01.printData();

        employer01.mediaSalaries();
    }
}
