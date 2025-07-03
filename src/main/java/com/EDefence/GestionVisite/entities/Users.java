package com.EDefence.GestionVisite.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, unique= true)
    private Long idUser;
    private String nom;
    private String prenom;
    private String email;
    private String motDePass;
    private String numeroWhatsapp;

    private enum Role{visiteur, personnel, agentSecurite}
}
