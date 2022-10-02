package au.com.newscorp.interview;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import au.com.newscorp.interview.model.BaseMovie;
import au.com.newscorp.interview.model.Genre;
import au.com.newscorp.interview.model.GenreResults;
import au.com.newscorp.interview.model.MovieResultsPage;
import au.com.newscorp.interview.model.Movies;

@Service
public class MovieService {
    
    @Autowired
    private RestTemplate restTemplate;

    @Value("${app.poster-url-prefix}")
    private String posterUrlPrefix;

    @Value("${app.genre-url-prefix}")
    private String genreUrlPrefix;

    @Value("${app.popular-movies-url-prefix}")
    private String popularMoviesUrlPrefix;

    @Value("${app.tmdb-api-key}")
    private String tmdbApiKey;
    
    public List<Movies> getTopFiveMovies() {
        List<Movies> movies = new ArrayList<>();
        GenreResults genreList = restTemplate.getForObject(genreUrlPrefix + "?api_key=" + tmdbApiKey + "&region=AU",GenreResults.class);
        MovieResultsPage latestMovies = restTemplate.getForObject(popularMoviesUrlPrefix + "?api_key=" + tmdbApiKey + "&region=AU",MovieResultsPage.class);
        for (int i = 0; i < 5; i++) {
          BaseMovie baseMovie = latestMovies.getResults().get(i);
          Movies movie = new Movies();
          movie.setId(1+i);
          movie.setTitle(baseMovie.getOriginal_title());
          movie.setPoster_url(posterUrlPrefix + baseMovie.getPoster_path());
          List<String> genres = new ArrayList<>();
          List<Integer> genreIdList = baseMovie.getGenre_ids();
          for (Integer genreId : genreIdList) {
            for (Genre genre : genreList.getGenres()) {
              if(genreId==genre.getId()) {
                genres.add(genre.getName());
              }
            }
          }
          movie.setGenre(genres);
          movies.add(movie);
        }
        return movies;
    }
}
