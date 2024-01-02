package com.booking.theatre.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Theatre {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private Address address;

    @OneToMany
    @Cascade(CascadeType.ALL)
    private List<Audi> audies;

    @Column(name = "THEATRE_LOCATION")
    private String location;

    @Column( nullable = false, updatable = false)
    @CreationTimestamp
    private Date createdDate;

}
