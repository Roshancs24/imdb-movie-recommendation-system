package com.movie.imdb.service;

import com.movie.imdb.model.Movie;
import com.movie.imdb.repository.MovieRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repo;

    public MovieService(MovieRepository repo) {
        this.repo = repo;
    }

    public List<Movie> allMovies() {
        return repo.findAll();
    }

    public List<Movie> search(String q) {
        return repo.findByTitleContainingIgnoreCase(q);
    }

    public List<Movie> vijayMovies() {
        return repo.findByActorIgnoreCase("Vijay");
    }

    public List<Movie> recommend(String genre, double rating) {
        return repo.recommend(genre, rating);
    }
}
