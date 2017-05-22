package model;

/**
 *
 */
public class Song {
    private String artist;
    private String title;
    private String videoUrl;

    public Song(String artist, String title, String url) {
        this.artist = artist;
        this.title = title;
        this.videoUrl = url;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return String.format("Song: %s by %s", getTitle(), getArtist());
    }


}
