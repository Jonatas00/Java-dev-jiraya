package jiraya.dev.javacore.Bmethodsintroduction.test;

import jiraya.dev.javacore.Bmethodsintroduction.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] arg) {
        Calculator calculator11 = new Calculator();

        int sum = calculator11.sumArray(4, 5, 6, 7, 8, 9);

        System.out.println(sum);
    }
}
