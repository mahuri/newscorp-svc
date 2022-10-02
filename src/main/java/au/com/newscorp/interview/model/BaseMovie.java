package au.com.newscorp.interview.model;

import java.util.Date;
import java.util.List;

public class BaseMovie extends BaseRatingObject {

    private Integer id;

    private Boolean adult;
    private String backdrop_path;
    private List<Genre> genres;
    private List<Integer> genre_ids;
    private String original_title;
    private String original_language;
    private String overview;
    private Double popularity;
    private String poster_path;
    private Date release_date;
    private String title;
    private Double vote_average;
    private Integer vote_count;
    private String media_type;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Boolean getAdult() {
        return adult;
    }
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }
    public String getBackdrop_path() {
        return backdrop_path;
    }
    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }
    public List<Genre> getGenres() {
        return genres;
    }
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
    public List<Integer> getGenre_ids() {
        return genre_ids;
    }
    public void setGenre_ids(List<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }
    public String getOriginal_title() {
        return original_title;
    }
    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }
    public String getOriginal_language() {
        return original_language;
    }
    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }
    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }
    public Double getPopularity() {
        return popularity;
    }
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }
    public String getPoster_path() {
        return poster_path;
    }
    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
    public Date getRelease_date() {
        return release_date;
    }
    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getVote_average() {
        return vote_average;
    }
    public void setVote_average(Double vote_average) {
        this.vote_average = vote_average;
    }
    public Integer getVote_count() {
        return vote_count;
    }
    public void setVote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }
    public String getMedia_type() {
        return media_type;
    }
    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }    
}
