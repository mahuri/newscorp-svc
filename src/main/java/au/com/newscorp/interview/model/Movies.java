package au.com.newscorp.interview.model;

import java.util.List;

public class Movies {
    private int id;
    private String title;
    private List<String> genre;
    private String poster_url;
    
    public Movies() {}

    public Movies(int id, String title, List<String> genre, String poster_url) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.poster_url = poster_url;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<String> getGenre() {
        return genre;
    }
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }
    public String getPoster_url() {
        return poster_url;
    }
    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    
}
