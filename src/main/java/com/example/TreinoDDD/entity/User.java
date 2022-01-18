package com.example.TreinoDDD.entity;

import com.example.TreinoDDD.dto.DTOEntity;
import com.example.TreinoDDD.dto.PasswordDTO;
import com.example.TreinoDDD.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends DomainEntity{

    private String firstName;
    private String lastName;
    private String email;

    @Embedded
    private Password password;

    @Override
    public DTOEntity convertToDto() {
        return new UserDTO(this.firstName,this.lastName,this.email, (PasswordDTO) this.password.convertToDto());
    }
}
