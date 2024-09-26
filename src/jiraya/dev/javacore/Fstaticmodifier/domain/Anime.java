package jiraya.dev.javacore.Fstaticmodifier.domain;

public class Anime {
  private String name;
  private static Integer[] episodes = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

  static {
    System.out.println("Dentro do bloco de inicalização");
  }

  public Anime(String name) {
    this.name = name;
  }

  public Anime() {
    for (int episodes : Anime.episodes) {
      System.out.print(episodes + " ");
    }
  }

  public String getName() {
    return name;
  }

  public Integer[] getEpisodes() {
    return episodes;
  }
}
