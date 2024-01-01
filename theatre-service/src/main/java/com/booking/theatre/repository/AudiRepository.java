package com.booking.theatre.repository;

import com.booking.theatre.entity.Audi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiRepository extends JpaRepository<Audi, Long> {
}
