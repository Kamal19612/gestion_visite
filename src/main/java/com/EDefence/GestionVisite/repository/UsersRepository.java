package com.EDefence.GestionVisite.repository;

import com.EDefence.GestionVisite.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
