package au.com.newscorp.interview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.newscorp.interview.model.Movies;

@SpringBootApplication
@RestController
public class SpringbootApplication {


  @Autowired
  MovieService movieService;

  public static void main(String[] args) {
    SpringApplication.run(SpringbootApplication.class, args);
  }

  @GetMapping("/movies")
  public List<Movies> getTopFiveMovies() {
    return movieService.getTopFiveMovies();
  }
}