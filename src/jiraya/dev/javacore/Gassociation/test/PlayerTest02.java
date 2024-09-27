package jiraya.dev.javacore.Gassociation.test;

import jiraya.dev.javacore.Gassociation.domain.Player;
import jiraya.dev.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
  public static void main(String[] args) {
    Player player1 = new Player("Vini Jr");
    Team team = new Team("Real Madrid");

    player1.setTeam(team);

    player1.printPlayerInfo();
  }
}
