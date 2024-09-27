package jiraya.dev.javacore.Fstaticmodifier.test;

import jiraya.dev.javacore.Fstaticmodifier.domain.Anime;

public class AnimeTest01 {
  public static void main(String[] args) {
    Anime anime01 = new Anime();
    Anime anime02 = new Anime();
    Anime anime03 = new Anime();

    String lll = String.format("%s %s %s", anime01, anime02, anime03);

    System.out.println(lll);
  }
}
