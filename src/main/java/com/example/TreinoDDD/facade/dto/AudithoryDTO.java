package com.example.TreinoDDD.facade.dto;

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

}
