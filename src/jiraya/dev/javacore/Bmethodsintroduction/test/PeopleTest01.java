package jiraya.dev.javacore.Bmethodsintroduction.test;

import jiraya.dev.javacore.Bmethodsintroduction.domain.People;

public class PeopleTest01 {
    public static void main(String[] args) {
        People people01 = new People();
        people01.setName("Josef");
        people01.setAge(21);


        people01.peopleInfos();

    }
}
