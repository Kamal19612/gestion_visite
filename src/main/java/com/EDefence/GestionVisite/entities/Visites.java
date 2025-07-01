package com.EDefence.GestionVisite.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalTime;

@Entity
@Table(name = "Visites")
public class Visites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, unique= true)
    private Long idVisite;

    private LocalTime heureArrive;
    public LocalTime getHeureArrive() {
        return heureArrive;
    }
    public void setHeureArrive(LocalTime heureArrive) {
        this.heureArrive = heureArrive;
    }

    private LocalTime heureDepart;
    public LocalTime getHeureDepart() {
        return heureDepart;
    }
    public void setHeureDepart(LocalTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    private String TypeDoc;
    public String getTypeDoc() {
        return TypeDoc;
    }
    public void setTypeDoc(String typeDoc) {
        TypeDoc = typeDoc;
    }

    private String NumeroDoc;
    public String getNumeroDoc() {
        return NumeroDoc;
    }
    public void setNumeroDoc(String numeroDoc) {
        NumeroDoc = numeroDoc;
    }

    private String Signature;
    public String getSignature() {
        return Signature;
    }
    public void setSignature(String signature) {
        Signature = signature;
    }

    private RendezVous rendezVous;
    public RendezVous getRendezVous() {
        return rendezVous;
    }
    public void setRendezVous(RendezVous rendezVous) {
        this.rendezVous = rendezVous;
    }

    private Users visiteur;
    public Users getVisiteur() {
        return visiteur;
    }
    public void setVisiteur(Users visiteur) {
        this.visiteur = visiteur;
    }

    private Users agentSecurite;
    public Users getAgentSecurite() {
        return agentSecurite;
    }
    public void setAgentSecurite(Users agentSecurite) {
        this.agentSecurite = agentSecurite;
    }
}
