package com.e_defence.gestionvisite.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "BoiteNotification")
public class BoiteNotification {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(updatable= false, unique= true)
    private Long idBN;

    private users destinataire;
    public users getDestinataire() {
        return destinataire;
    }
    public void setDestinataire(users destinataire) {
        this.destinataire = destinataire;
    }

    private String massage;
    public String getMassage() {
        return massage;
    }
    public void setMassage(String massage) {
        this.massage = massage;
    }

    private LocalDateTime dateEnvoi;
    public LocalDateTime getDateEnvoi(){
        return dateEnvoi;
    }
    public void setDateEnvoi(LocalDateTime dateEnvoi){
        this.dateEnvoi= dateEnvoi;
    }

    private Boolean lu;
    public Boolean getLu() {
        return lu;
    }
    public void setLu(Boolean lu) {
        this.lu = lu;
    }
}

