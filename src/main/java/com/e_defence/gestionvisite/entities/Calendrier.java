package com.e_defence.gestionvisite.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name= "Calendrier")
public class Calendrier {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(updatable= false, unique= true)
    private Long idCalendrier;

    private users personnel;
    public users getPersonnel() {
        return personnel;
    }
    public void setPersonnel(users personnel) {
        this.personnel = personnel;
    }

    private LocalDate date;
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    private Boolean disponible;
    public Boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    private List<String> crenaux;
    public List<String> getCrenaux() {
        return crenaux;
    }
    public void setCrenaux(List<String> crenaux) {
        this.crenaux = crenaux;
    }
}
