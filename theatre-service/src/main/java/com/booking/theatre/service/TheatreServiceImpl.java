package com.booking.theatre.service;

import com.booking.theatre.entity.Address;
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
    private final AddressService addressService;

    @Autowired
    public TheatreServiceImpl(TheatreRepository theatreRepository,
                              AddressService addressService) {
        this.theatreRepository = theatreRepository;
        this.addressService = addressService;
    }

    @Override
    public Theatre create(Theatre theatre) {

      //  Address address = this.addressService.findById(theatre.getAddress().getId());
       // theatre.setAddress(address);
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
