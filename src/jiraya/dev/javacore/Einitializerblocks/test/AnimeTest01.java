package jiraya.dev.javacore.Einitializerblocks.test;

import jiraya.dev.javacore.Einitializerblocks.domain.Anime;

public class AnimeTest01 {
  public static void main(String[] args) {
    Anime anime = new Anime("Test");

    for (Integer episode : anime.getEpisodes()) {
      System.out.print(episode + " ");
    }
  }
}
