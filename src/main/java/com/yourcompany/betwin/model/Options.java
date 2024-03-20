package com.yourcompany.betwin.model;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(length=30)  
    @Required
    private String intitule;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    @DescriptionsList(descriptionProperties="name")
    private Type type;

    @ManyToOne(
            fetch=FetchType.LAZY,
            optional=true) 
        @DescriptionsList (descriptionProperties="nom")
        Sport sport; // A 
}
