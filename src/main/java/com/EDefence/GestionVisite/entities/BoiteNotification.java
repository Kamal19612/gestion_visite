package com.EDefence.GestionVisite.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Table(name = "BoiteVisite")
public class BoiteNotification {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(updatable= false, unique= true)
    private Long idBN;

    private Users destinataire;
    public Users getDestinataire() {
        return destinataire;
    }
    public void setDestinataire(Users destinataire) {
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
