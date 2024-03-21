package com.yourcompany.betwin.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Sport {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length=32)
    private String code;
 
    @Column(length=50)
    String nom;
  
    @TextArea
    String regles;
  

    // Getters et Setters
}