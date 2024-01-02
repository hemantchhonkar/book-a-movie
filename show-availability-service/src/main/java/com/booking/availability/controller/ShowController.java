package com.booking.availability.controller;

import com.booking.availability.entity.MovieShow;
import com.booking.availability.service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shows")
public class ShowController {
    private final MovieShowService movieShowService;

    @Autowired
    public ShowController(MovieShowService movieShowService) {
        this.movieShowService = movieShowService;
    }

    @GetMapping
    public ResponseEntity<List<MovieShow>> getAllShows(){
        return ResponseEntity.ok(this.movieShowService.getShows());
    }

    @PostMapping
    public ResponseEntity<MovieShow> createShow(@RequestBody MovieShow movieShow){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.movieShowService.createShow(movieShow));
    }
    @PutMapping("/{showId}")
    public ResponseEntity<MovieShow> updateShow(@PathVariable("showId") Long showId, @RequestBody MovieShow movieShow){
        return ResponseEntity.ok(this.movieShowService.updateShow(movieShow,showId));
    }
}
