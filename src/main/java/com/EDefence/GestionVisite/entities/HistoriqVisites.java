package com.EDefence.GestionVisite.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Table(name= "HistoriqVisites")
public class HistoriqVisites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable= false, unique= true)
    private Long idHV;

    private Visites visite;
    public Visites getVisite() {
        return visite;
    }
    public void setVisite(Visites visite) {
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
