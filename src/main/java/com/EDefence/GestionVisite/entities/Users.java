package com.EDefence.GestionVisite.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, unique= true)
    private Long idUser;

    private String nom;
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    private String prenom;
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    private String motDePass;
    public String getMotDePass() {
        return motDePass;
    }
    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    private String numeroWhatsapp;
    public String getNumeroWhatsapp() {
        return numeroWhatsapp;
    }
    public void setNumeroWhatsapp(String numeroWhatsapp) {
        this.numeroWhatsapp = numeroWhatsapp;
    }

    private enum Role{visiteur, personnel, agentSecurite}
}
