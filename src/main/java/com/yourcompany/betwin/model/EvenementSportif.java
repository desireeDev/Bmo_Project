package com.yourcompany.betwin.model;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class EvenementSportif {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_id")
    @DescriptionsList (descriptionProperties="name")
    private Sport sport;

    @OneToMany(mappedBy = "evenement", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<Pari> paris;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookmaker_id")
    private Bookmaker bookmaker;


    // Getters et Setters
}
