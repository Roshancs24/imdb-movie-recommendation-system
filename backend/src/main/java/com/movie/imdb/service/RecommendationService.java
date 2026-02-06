package com.movie.imdb.service;

import com.movie.imdb.model.Movie;
import com.movie.imdb.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    private final MovieRepository repo;

    public RecommendationService(MovieRepository repo) {
        this.repo = repo;
    }

    public List<Movie> recommend(Long movieId) {

        Movie baseMovie = repo.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        return repo.findAll().stream()
                .filter(m -> !m.getId().equals(movieId))
                .filter(m -> m.getGenre().equalsIgnoreCase(baseMovie.getGenre()))
                .limit(6)
                .toList();
    }
}
