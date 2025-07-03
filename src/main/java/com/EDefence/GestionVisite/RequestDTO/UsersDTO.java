package com.EDefence.GestionVisite.RequestDTO;

import lombok.*;
// renvoie les informations de l'utilisateur à l'entité
@Setter
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UsersDTO {
    private String nom;
    private String prenom;
    private String email;
    private String motDePass;
    private String numeroWhatsapp;
}
