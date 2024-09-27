package jiraya.dev.javacore.Gassociation.domain;

public class Player {
  private String name;
  private Team team;

  public Player(String name) {
    this.name = name;
  }

  public void printPlayerInfo() {
    System.out.printf("Nome do jogador: %s \n", this.name);
    if (this.team != null) {
      System.out.printf("Time cadastrado: %s \n", this.team.getName());
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

}
