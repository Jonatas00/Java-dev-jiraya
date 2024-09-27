package jiraya.dev.javacore.Gassociation.test;

import jiraya.dev.javacore.Gassociation.domain.School;
import jiraya.dev.javacore.Gassociation.domain.Teacher;

public class SchoolTest01 {
  public static void main(String[] args) {
    Teacher teacher01 = new Teacher("Jiraya Sensei");
    Teacher teacher02 = new Teacher("Tsunade");

    School rdp = new School("Colégio Rainha da Paz");

    rdp.setTeachers(new Teacher[] { teacher01, teacher02 });

    rdp.printInfos();
  }
}
