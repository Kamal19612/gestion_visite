package com.e_defence.gestionvisite.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name= "RendezVous")
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable= false, unique = true)
    private Long idRDV;

    private LocalDate dateRendezVous;
    public LocalDate getDateRendezVous() {
        return dateRendezVous;
    }
    public void setDateRendezVous(LocalDate dateRendezVous) {
        this.dateRendezVous = dateRendezVous;
    }

    private String motif;
    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }

    private users visiteur;
    public users getVisiteur() {
        return visiteur;
    }
    public void setVisiteur(users visiteur) {
        this.visiteur = visiteur;
    }

    private users personnel;
    public users getPersonnel() {
        return personnel;
    }
    public void setPersonnel(users personnel) {
        this.personnel = personnel;
    }

    private LocalDateTime dateDemande;
    public LocalDateTime getDateDemande() {
        return dateDemande;
    }
    public void setDateDemande(LocalDateTime dateDemande) {
        this.dateDemande = dateDemande;
    }

    private enum Statut { EN_ATTENTE, VALIDE, REJETE }
}
