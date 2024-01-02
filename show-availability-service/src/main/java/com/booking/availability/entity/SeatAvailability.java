package com.booking.availability.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class SeatAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String sectionType;
    @Column
    private String seatRow;

    @Column
    private String seatNumber;

    @Column
    private Boolean available;

    @Column
    private Boolean reserved;
}
