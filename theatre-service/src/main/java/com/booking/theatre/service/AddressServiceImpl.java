package com.booking.theatre.service;

import com.booking.theatre.entity.Address;
import com.booking.theatre.entity.Theatre;
import com.booking.theatre.repository.AddressRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository= addressRepository;
    }
    @Override
    public Address create(Address address) {
        return this.addressRepository.save(address);
    }

    @Override
    public Address findById(Long addressId) {
        return this.addressRepository.findById(addressId).orElseThrow(()->new EntityNotFoundException("Address not found for given ID"));
    }
}
