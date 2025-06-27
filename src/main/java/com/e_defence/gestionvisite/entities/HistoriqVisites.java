package com.e_defence.gestionvisite.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name= "HistoriqVisites")
public class HistoriqVisites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable= false, unique= true)
    private Long idHV;

    private visites visite;
    public visites getVisite() {
        return visite;
    }
    public void setVisite(visites visite) {
        this.visite = visite;
    }

    private String resumer;
    public String getResumer() {
        return resumer;
    }
    public void setResumer(String resumer) {
        this.resumer = resumer;
    }

    private LocalDateTime dateArchiver;
    public LocalDateTime getDateArchiver() {
        return dateArchiver;
    }
    public void setDateArchiver(LocalDateTime dateArchiver) {
        this.dateArchiver = dateArchiver;
    }
}
