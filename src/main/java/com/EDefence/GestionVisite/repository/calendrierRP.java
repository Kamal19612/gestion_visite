package com.EDefence.GestionVisite.repository;

import com.EDefence.GestionVisite.entities.Calendrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface calendrierRP extends JpaRepository<Calendrier, Long> {
}
