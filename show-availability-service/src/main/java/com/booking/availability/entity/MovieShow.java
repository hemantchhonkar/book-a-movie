package com.booking.availability.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Calendar;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class MovieShow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long movieId;
    @Column
    private Long theatreId;
    @Column
    private Long audiId;

    @Temporal(TemporalType.DATE)
    private Calendar date;

    @Column
    private Time time;

    @Column
    private Boolean active;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SeatAvailability> seatAvailabilities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getAudiId() {
        return audiId;
    }

    public void setAudiId(Long audiId) {
        this.audiId = audiId;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<SeatAvailability> getSeatAvailabilities() {
        return seatAvailabilities;
    }

    public Long getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Long theatreId) {
        this.theatreId = theatreId;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setSeatAvailabilities(List<SeatAvailability> seatAvailabilities) {
        this.seatAvailabilities = seatAvailabilities;
    }
}
