package com.booking.theatre.service;

import com.booking.theatre.entity.Address;
import com.booking.theatre.entity.Audi;
import com.booking.theatre.repository.AudiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudiServiceImpl implements AudiService{
    private final AudiRepository audiRepository;

    @Autowired
    public AudiServiceImpl(AudiRepository audiRepository){
        this.audiRepository=audiRepository;
    }

    @Override
    public List<Audi> createMultiple(List<Audi> audiList) {
        return this.audiRepository.saveAll(audiList);
    }
}
