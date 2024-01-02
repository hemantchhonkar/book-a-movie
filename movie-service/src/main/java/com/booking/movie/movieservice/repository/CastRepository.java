package com.booking.movie.movieservice.repository;

import com.booking.movie.movieservice.entity.Cast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CastRepository extends JpaRepository<Cast, Long> {
}
