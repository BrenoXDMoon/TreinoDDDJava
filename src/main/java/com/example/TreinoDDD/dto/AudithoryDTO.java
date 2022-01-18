package com.example.TreinoDDD.dto;

import com.example.TreinoDDD.entity.Audithory;
import com.example.TreinoDDD.entity.DomainEntity;
import com.example.TreinoDDD.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AudithoryDTO extends DTOEntity {

    private String operationName;
    private UserDTO operationUser;

    @Override
    public DomainEntity convertToEntity() {
        return new Audithory(this.operationName,(User)this.operationUser.convertToEntity());
    }
}
