package jiraya.dev.javacore.methodsintroduction.test;

import jiraya.dev.javacore.methodsintroduction.domain.Employer;

public class EmployerExercise {
    public static void main(String[] args) {
        Employer employer01 = new Employer();
        employer01.setName("Tete");
        employer01.setAge(24);


        employer01.setSalaries(new double[]{1200, 1322, 1432});

        employer01.printData();

        employer01.getAverage();
    }
}
