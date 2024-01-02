package com.booking.movie.movieservice.service;

import com.booking.movie.movieservice.entity.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> getMovies();
    public Movie getMovieById(Long id);
    public Movie createMovie(Movie movie);
    public Movie updateMovie(Long id, Movie movie);
}
