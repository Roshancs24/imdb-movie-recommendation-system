package com.movie.imdb.controller;

import com.movie.imdb.model.Movie;
import com.movie.imdb.service.MovieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin("*")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public List<Movie> all() {
        return service.allMovies();
    }

    @GetMapping("/search")
    public List<Movie> search(@RequestParam String q) {
        return service.search(q);
    }

    @GetMapping("/vijay")
    public List<Movie> vijay() {
        return service.vijayMovies();
    }

    @GetMapping("/recommend")
    public List<Movie> recommend(
            @RequestParam String genre,
            @RequestParam double rating) {
        return service.recommend(genre, rating);
    }
}
