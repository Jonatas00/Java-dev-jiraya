package jiraya.dev.javacore.Bmethodsintroduction.domain;

public class Employer {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public void getAverage() {
        mediaSalaries();
    }

    public void printData() {
        System.out.printf("Employer name: %s \nEmployer age: %d \n", this.name, this.age);
        System.out.println("Salaries:");
        for (double salary : this.salaries) {
            System.out.printf("R$%.2f\n", salary);
        }
    }

    public void mediaSalaries() {
        int salariesQuantity = this.salaries.length;

        double total = 0;
        for (double salary : this.salaries) {
            total += salary;
        }
        this.average = total / salariesQuantity;

        System.out.printf("The media of %s's salaries is R$%.2f", this.name, this.average);
    }
}
