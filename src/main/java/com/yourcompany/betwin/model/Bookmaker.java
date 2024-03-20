package com.yourcompany.betwin.model;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Bookmaker {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
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
   
   
   @Icon
   @Column(length=40)
   private String icon;
    // autres attributs et méthodes
}



