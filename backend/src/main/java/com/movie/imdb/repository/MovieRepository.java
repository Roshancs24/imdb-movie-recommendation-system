package com.movie.imdb.repository;

import com.movie.imdb.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByActorIgnoreCase(String actor);

    List<Movie> findByTitleContainingIgnoreCase(String title);

    @Query("""
        SELECT m FROM Movie m
        WHERE LOWER(m.genre) = LOWER(:genre)
        AND m.rating >= :rating
        ORDER BY m.rating DESC
    """)
    List<Movie> recommend(String genre, double rating);
}
