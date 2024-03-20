package com.yourcompany.betwin.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Sport {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length=32)
    String oid;
 
    @Column(length=50)
    String nom;
  
    @TextArea
    String regles;
  

    // Getters et Setters
}