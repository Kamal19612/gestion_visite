package com.EDefence.GestionVisite.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name= "Calendrier")
public class Calendrier {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(updatable= false, unique= true)
        private Long idCalendrier;

        private Users personnel;
        public Users getPersonnel() {
            return personnel;
        }
        public void setPersonnel(Users personnel) {
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
