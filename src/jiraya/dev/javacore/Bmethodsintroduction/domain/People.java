package jiraya.dev.javacore.Bmethodsintroduction.domain;

public class People {
    private String name;
    private int age = 1;

    public void peopleInfos() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age!!");
            return;
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
