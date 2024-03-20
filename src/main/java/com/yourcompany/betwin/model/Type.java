package com.yourcompany.betwin.model;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Type {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(length=50)
    @Required
    private String name;




}


