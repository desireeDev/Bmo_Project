package com.yourcompany.betwin.model;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Parieur {
    @Id
  
    @GeneratedValue(generator="system-uuid")
    @Column(length=6)  
    @Required
    private String name;
    @Column(length=50)  
    @Required
    private String firstname;
    @Column(length=50)  
    @Required
    private String email;
  
    @Password
    @Column(length=40)
    private String password;

    // Getters et Setters
}