package jiraya.dev.introducao;

public class ConditionalStatementsExercise {
    public static void main(String[] args) {
        double salary = 45000;

        double taxPercentage;

        if (salary > 0 && salary <= 34712) {
            taxPercentage = 9.7;
        } else if (salary >= 34713 && salary <= 68507) {
            taxPercentage = 37.3;
        } else if (salary >= 68508) {
            taxPercentage = 49.5;
        } else {
            throw new Error("WTF, don't you have payments??");
        }

        System.out.printf("You need to pay %.2f the tax is %.2f%%", salary * (taxPercentage / 100), taxPercentage);
    }
}
