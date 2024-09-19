package jiraya.dev.javacore.DConstructors.test;

import jiraya.dev.javacore.DConstructors.domain.Anime;

public class AnimeTest01 {
  public static void main(String[] args) {
    Anime dbz = new Anime();
    Anime dbz33 = new Anime();

    dbz.init("Dragon Ball Z", "Action", 8000);
    dbz33.init("Dragon Ball Z", "Action", 8000, true);
    dbz.printAnimeInfos();
    System.out.println();
    dbz33.printAnimeInfos();
  }
}
