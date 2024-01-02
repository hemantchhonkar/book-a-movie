package com.booking.availability.service;

import com.booking.availability.entity.MovieShow;

import java.util.List;

public interface MovieShowService {
    public MovieShow createShow(MovieShow movieShow);
    public  MovieShow updateShow(MovieShow movieShow, Long showId);

    public List<MovieShow> getShows();

    public MovieShow getShow(Long showId);
}
