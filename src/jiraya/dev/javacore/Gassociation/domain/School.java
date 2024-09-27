package jiraya.dev.javacore.Gassociation.domain;

public class School {
  private String name;
  private Teacher[] teachers;

  public void printInfos() {
    System.out.println(this.name);
    if (teachers != null) {
      for (Teacher teacher : teachers) {
        System.out.println("Professor: " + teacher.getName());
      }
    }
  }

  public School(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teacher[] getTeachers() {
    return teachers;
  }

  public void setTeachers(Teacher[] teachers) {
    this.teachers = teachers;
  }

}
