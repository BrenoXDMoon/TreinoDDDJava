package com.example.TreinoDDD.dto;

import com.example.TreinoDDD.entity.DomainEntity;
import com.example.TreinoDDD.entity.Password;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordDTO extends DTOEntity {

    private String password;
    private String confirmPassword;

    @Override
    public DomainEntity convertToEntity() {
        return new Password(this.password, this.confirmPassword);
    }
}
