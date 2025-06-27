package com.e_defence.gestionvisite.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name="Visites")
public class visites {

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

    private users visiteur;
    public users getVisiteur() {
        return visiteur;
    }
    public void setVisiteur(users visiteur) {
        this.visiteur = visiteur;
    }

    private users agentSecurite;
    public users getAgentSecurite() {
        return agentSecurite;
    }
    public void setAgentSecurite(users agentSecurite) {
        this.agentSecurite = agentSecurite;
    }
}
