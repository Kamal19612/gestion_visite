package com.e_defence.gestionvisite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "name = users")
public class users {
    private String nom;
    private String prenom;
    private String email;
    private String MotDePass;
    
}
