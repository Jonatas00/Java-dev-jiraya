package jiraya.dev.javacore.Gassociation.test;

import jiraya.dev.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
  public static void main(String[] args) {
    Player player1 = new Player("Pelé");
    Player player2 = new Player("Cristiano Ronaldo");

    Player[] players = new Player[] { player1, player2 };

    for (Player p : players) {
      p.printPlayerName();
    }
  }
}
