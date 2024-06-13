package jiraya.dev.javacore.methodsintroduction.test;

import jiraya.dev.javacore.methodsintroduction.domain.Printer;
import jiraya.dev.javacore.methodsintroduction.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Student student01 = new Student();

        student01.name = "Caio";
        student01.age = 19;
        student01.gender = 'M';

        printer.PrintStdnt(student01);


    }
}
