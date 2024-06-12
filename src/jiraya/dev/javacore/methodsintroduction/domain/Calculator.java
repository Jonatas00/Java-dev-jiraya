package jiraya.dev.javacore.methodsintroduction.domain;

public class Calculator {
    public void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public int division(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public int triple(int n) {
        return n * 3;
    }

}
