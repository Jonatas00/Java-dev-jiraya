package jiraya.dev.javacore.Aclassintroduction.test;

import jiraya.dev.javacore.Aclassintroduction.domain.Padawan;

public class PadawanTest01 {
    public static void main(String[] args) {
        Padawan pad01 = new Padawan("Anakin", 21, 'M');

        Padawan pad02 = new Padawan("Luke", 15, 'M');

        System.out.println(pad01.name);
        System.out.println(pad01.age);
        System.out.println(pad01.gender);

        // Reference

        pad02 = pad01;

        System.out.println(pad02.name);
    }
}
