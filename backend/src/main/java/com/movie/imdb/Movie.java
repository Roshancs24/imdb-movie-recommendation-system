package com.movie.imdb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String genre;

    private String language;

    private String actor;   // 🔥 THIS IS REQUIRED

    private double rating;

    @Column(name = "poster_url")
    private String posterUrl;

    public Movie() {}

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getLanguage() { return language; }
    public String getActor() { return actor; }
    public double getRating() { return rating; }
    public String getPosterUrl() { return posterUrl; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setLanguage(String language) { this.language = language; }
    public void setActor(String actor) { this.actor = actor; }
    public void setRating(double rating) { this.rating = rating; }
    public void setPosterUrl(String posterUrl) { this.posterUrl = posterUrl; }
}
