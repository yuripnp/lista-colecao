package model;

import java.time.Duration;

public class Video implements Comparable<Video> {
    private String title;
    private String description;
    private Duration duration;

    public Video() {

    }
    public Video(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Video outroVideo) {
        return this.title.compareTo(outroVideo.title);
    }
}
