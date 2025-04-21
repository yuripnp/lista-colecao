package model;

import java.time.Duration;

public class Episodio extends Video {
    private int season;
    private int episodeNumber;

    public Episodio(String title, String description, int season, int episodeNumber) {
        super(title, description);
        this.season = season;
        this.episodeNumber = episodeNumber;
    }

    public int getSeason() {
        return season;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }
}
