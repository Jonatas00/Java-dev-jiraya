package jiraya.dev.javacore.Dconstructors.domain;

public class Anime {
  private String name;
  private String genre;
  private Boolean haveManga;
  private Integer episodes;

  public Anime(String name, String genre, int episodes) {
    this.name = name;
    this.genre = genre;
    this.episodes = episodes;
  }

  public Anime(String name, String genre, int episodes, boolean haveManga) {
    this.name = name;
    this.genre = genre;
    this.episodes = episodes;
    this.haveManga = haveManga;
  }

  public void init(String name, String genre, int episodes) {
    this.name = name;
    this.genre = genre;
    this.episodes = episodes;
  }

  public void init(String name, String genre, int episodes, boolean haveManga) {
    this.init(name, genre, episodes);
    this.haveManga = haveManga;
  }

  public void printAnimeInfos() {
    System.out.println(this.name);
    System.out.println(this.episodes);
    System.out.println(this.genre);
    if (this.haveManga != null) {
      System.out.println(this.haveManga);
    }
  }

  // #region getters and setters
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setEpisodes(int episodes) {
    this.episodes = episodes;
  }

  public int getEpisodes() {
    return this.episodes;
  }

  public boolean isHaveManga() {
    return haveManga;
  }

  public void setHaveManga(boolean haveManga) {
    this.haveManga = haveManga;
  }
  // #endregion

}
