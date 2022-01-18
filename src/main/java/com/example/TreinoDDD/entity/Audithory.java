package com.example.TreinoDDD.entity;

import com.example.TreinoDDD.dto.AudithoryDTO;
import com.example.TreinoDDD.dto.DTOEntity;
import com.example.TreinoDDD.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audithory extends DomainEntity{

    private String operationName;
    @ManyToOne
    @JoinColumn(name = "operation_user_ID")
    private User operationUser;

    @Override
    public DTOEntity convertToDto() {
        return new AudithoryDTO(this.operationName, (UserDTO) this.getOperationUser().convertToDto());
    }
}
