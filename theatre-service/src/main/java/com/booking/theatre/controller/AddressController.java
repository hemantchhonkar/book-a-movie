package com.booking.theatre.controller;

import com.booking.theatre.entity.Address;
import com.booking.theatre.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("theatres/addresses")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService){
        this.addressService=addressService;
    }
    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address address){
        return ResponseEntity.ok(this.addressService.create(address));
    }
}
