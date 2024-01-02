package com.booking.theatre.service;

import com.booking.theatre.entity.Address;

public interface AddressService {
    public Address create(Address address);
    public Address findById(Long addressId);
}
