package com.EDefence.GestionVisite.ResponseDTO;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UsersResponseDTO {
    private Long idUser;
    private String nom;
    private String prenom;
    private String email;
    private String numeroWhatsapp;
}
