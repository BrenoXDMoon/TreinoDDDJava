package com.example.TreinoDDD.facade.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends DTOEntity {

    private String firstName;
    private String lastName;
    private String email;

}