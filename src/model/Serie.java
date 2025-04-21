package model;

import java.util.ArrayList;
import java.util.Date;

public class Serie extends  Video {
    private String genre;
    private Date releaseDate;


    public Serie(String title, String description, String genre, Date releaseDate) {
        super(title, description);
        this.genre = genre;
        this.releaseDate = releaseDate;
    }
    public Serie(){

    }

    public String getGenre() {
        return genre;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
}
