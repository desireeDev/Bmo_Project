package com.yourcompany.betwin.model;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pari {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(length=30)  
    @Required
    @Money 
    private String  montant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parieur_id")
    @DescriptionsList
    private Parieur parieur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evenement_id")
    @DescriptionsList
    private EvenementSportif evenement;
    
  

    // Getters et Setters
}


