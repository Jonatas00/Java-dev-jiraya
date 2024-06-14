package jiraya.dev.javacore.methodsintroduction.domain;

import java.util.Arrays;

public class Employer {
    protected String name;
    protected int age;
    protected double[] salaries;

    public Employer(String name, int age, double[] salaries) {
        this.name = name;
        this.age = age;
        this.salaries = salaries;
    }

    public void printData() {
        System.out.printf("Employer name: %s \nEmployer age: %d \n", this.name, this.age);
        System.out.println("Salaries: R$"+ Arrays.toString(this.salaries));
    }

    public void mediaSalaries() {
        int salariesQuantity = this.salaries.length;

        double total = 0;
        for (double s : this.salaries) {
            total += s;
        }
        double media = total / salariesQuantity;

        System.out.printf("The media of %s's salaries is R$%.2f", this.name, media);
    }
}
