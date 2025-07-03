package com.EDefence.GestionVisite.controllers;

import com.EDefence.GestionVisite.entities.Users;
import com.EDefence.GestionVisite.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UsersController {
    private final UsersRepository userRepository;

    @PostMapping("/api/user")
    public Users createUsers (Users user){
        return userRepository.save(user);
    }
}
