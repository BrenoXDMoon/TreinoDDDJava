package com.example.TreinoDDD.dto;

import com.example.TreinoDDD.entity.DomainEntity;
import com.example.TreinoDDD.entity.Password;
import com.example.TreinoDDD.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends DTOEntity {

    private String firstName;
    private String lastName;
    private String email;
    private PasswordDTO password;

    @Override
    public DomainEntity convertToEntity() {
        return new User(this.firstName, this.lastName, this.email, (Password) this.password.convertToEntity());
    }
}