package com.EDefence.GestionVisite.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

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

    private Users visiteur;
    public Users getVisiteur() {
        return visiteur;
    }
    public void setVisiteur(Users visiteur) {
        this.visiteur = visiteur;
    }

    private Users personnel;
    public Users getPersonnel() {
        return personnel;
    }
    public void setPersonnel(Users personnel) {
        this.personnel = personnel;
    }

    private LocalDateTime dateDemande;
    public LocalDateTime getDateDemande() {
        return dateDemande;
    }
    public void setDateDemande(LocalDateTime dateDemande) {
        this.dateDemande = dateDemande;
    }

    //private enum Statut { EN_ATTENTE, VALIDE, REJETE }
}
