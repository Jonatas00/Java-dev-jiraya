package jiraya.dev.javacore.classintroduction.test;

import jiraya.dev.javacore.classintroduction.domain.Jedi;

public class JediTest01 {
    public static void main(String[] args) {
        Jedi jedi = new Jedi();

        jedi.name = "Yoda";
        jedi.age = 324;
        jedi.gender = 'M';

        System.out.printf("Jedi name: %s, age: %d, gender: %c ",jedi.name, jedi.age, jedi.gender);
    }
}
