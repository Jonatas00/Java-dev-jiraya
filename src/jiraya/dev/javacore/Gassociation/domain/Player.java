package jiraya.dev.javacore.Gassociation.domain;

public class Player {
  private String name;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void printPlayerName() {
    System.out.printf("Nome do jogador: %s \n", this.name);
  }

  public void setName(String name) {
    this.name = name;
  }

}
