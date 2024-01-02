package com.booking.movie.movieservice.service;

import com.booking.movie.movieservice.entity.Movie;
import com.booking.movie.movieservice.repository.MovieRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).
                orElseThrow(()-> new EntityNotFoundException("Movie not found with id :"+id));
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Long id, Movie movie) {
        Movie existingmovie = movieRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("movie not found with id: " + id));

        // Update the existing movie's properties
        existingmovie.setTitle(movie.getTitle());
        existingmovie.setDescription(movie.getDescription());
        existingmovie.setTrailerUrl(movie.getTrailerUrl());
        existingmovie.setBannerUrl(movie.getBannerUrl());
        existingmovie.setStatus(movie.getStatus());


        // Save the updated movie
        return movieRepository.save(existingmovie);
    }
}
