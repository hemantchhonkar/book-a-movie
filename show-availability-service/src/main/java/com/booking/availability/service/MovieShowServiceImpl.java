package com.booking.availability.service;

import com.booking.availability.entity.MovieShow;
import com.booking.availability.repository.MovieShowRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowServiceImpl implements MovieShowService{

    private final MovieShowRepository movieShowRepository;

    @Autowired
    public MovieShowServiceImpl(MovieShowRepository movieShowRepository) {
        this.movieShowRepository = movieShowRepository;
    }

    @Override
    public MovieShow createShow(MovieShow movieShow) {
        return this.movieShowRepository.save(movieShow);
    }

    @Override
    public MovieShow updateShow(MovieShow movieShow, Long showId) {
        MovieShow showFromDb = this.movieShowRepository.findById(showId).orElseThrow(
                ()-> new EntityNotFoundException("Show not found for id "+showId)
        );
        showFromDb.setMovieId(movieShow.getMovieId());
        showFromDb.setAudiId(movieShow.getAudiId());
        showFromDb.setDate(movieShow.getDate());
        showFromDb.setTime(movieShow.getTime());
        showFromDb.setActive(showFromDb.getActive());
        return this.movieShowRepository.save(showFromDb);
    }

    @Override
    public List<MovieShow> getShows() {
        return this.movieShowRepository.findAll();
    }

    @Override
    public MovieShow getShow(Long showId) {
        return this.movieShowRepository.findById(showId).orElseThrow(
                ()-> new EntityNotFoundException("Show not found for id "+showId)
        );
    }
}
