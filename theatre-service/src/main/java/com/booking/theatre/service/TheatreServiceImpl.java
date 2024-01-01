package com.booking.theatre.service;

import com.booking.theatre.entity.Theatre;
import com.booking.theatre.repository.TheatreRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService{

    private final TheatreRepository theatreRepository;

    @Autowired
    public TheatreServiceImpl(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    @Override
    public Theatre create(Theatre theatre) {
        return this.theatreRepository.save(theatre);
    }

    @Override
    public Theatre findById(Long theatreId) {
        return this.theatreRepository.findById(theatreId)
                .orElseThrow(()
                        ->new EntityNotFoundException("Theatre for given id "+theatreId+" doesn't exist"));
    }

    @Override
    public List<Theatre> findAll() {
        return this.theatreRepository.findAll();
    }
}
