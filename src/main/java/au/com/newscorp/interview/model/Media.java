package au.com.newscorp.interview.model;

public class Media {

    private BaseMovie movie;

    private MediaType media_type;

    public BaseMovie getMovie() {
        return movie;
    }

    public void setMovie(BaseMovie movie) {
        this.movie = movie;
    }

    public MediaType getMedia_type() {
        return media_type;
    }

    public void setMedia_type(MediaType media_type) {
        this.media_type = media_type;
    }
    
}
