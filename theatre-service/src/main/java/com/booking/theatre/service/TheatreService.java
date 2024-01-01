package com.booking.theatre.service;

import com.booking.theatre.entity.Theatre;

import java.util.List;

public interface TheatreService {
    public Theatre create(Theatre theatre);
    public Theatre findById(Long theatreId);
    public List<Theatre> findAll();
}
