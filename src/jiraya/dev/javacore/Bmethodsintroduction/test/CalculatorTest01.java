package jiraya.dev.javacore.Bmethodsintroduction.test;

import jiraya.dev.javacore.Bmethodsintroduction.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sum(3, 3);

        calculator.subtract(4, 3);

        int tripledNum = calculator.triple(3);
        System.out.println(tripledNum);

        int divisionResult = calculator.division(2, 3);
        System.out.println(divisionResult);

    }
}
