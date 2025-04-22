package model;

public class Filme extends Video {
    private String genre;
    private String releaseDate;

    public Filme() {
    }
    public Filme(String title, String description, String genre, String releaseDate) {
        super(title, description);
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "title='" + getTitle() + '\'' +
                '}';
    }

    public String getGenre() {
        return genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
