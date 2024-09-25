package jiraya.dev.javacore.Einitializerblocks.domain;

public class Anime {
  private String name;
  private Integer[] episodes = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

  {
    System.out.println("Dentro do bloco de inicalização");
    episodes = new Integer[100];
    for (int i = 0; i < episodes.length; i++) {
      episodes[i] = i + 1;
    }
  }

  public Anime(String name) {
    this.name = name;
  }

  public Anime() {
    for (int episodes : this.episodes) {
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