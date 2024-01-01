package com.booking.theatre.controller;

import com.booking.theatre.entity.Theatre;
import com.booking.theatre.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theatres")
public class TheatreController {

    private final TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Theatre>> getAll(){
        return ResponseEntity.ok(this.theatreService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Theatre> getById(@PathVariable Long theatreId){
        return ResponseEntity.ok(this.theatreService.findById(theatreId));
    }

    @PostMapping
    public ResponseEntity<Theatre> create(@RequestBody Theatre theatre){
        return ResponseEntity.ok(this.theatreService.create(theatre));
    }
}
