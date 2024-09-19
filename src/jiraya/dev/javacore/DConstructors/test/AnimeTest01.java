package jiraya.dev.javacore.Dconstructors.test;

import jiraya.dev.javacore.Dconstructors.domain.Anime;

public class AnimeTest01 {
  public static void main(String[] args) {
    Anime dbz = new Anime("Dragon Ball Z", "Action", 8000, true);
    Anime deathNote = new Anime("Death Note", "Drama", 24, true, "catapimbas");

    // dbz.init("Dragon Ball Z", "Action", 8000);
    // dbz33.init("Dragon Ball GT", "Action", 8000, true);

    dbz.printAnimeInfos();
    System.out.println();
    deathNote.printAnimeInfos();

    
  }
}
