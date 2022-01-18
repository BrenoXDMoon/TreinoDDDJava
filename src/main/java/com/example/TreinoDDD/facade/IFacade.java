package com.example.TreinoDDD.facade;

import com.example.TreinoDDD.dto.DTOEntity;
import com.example.TreinoDDD.entity.DomainEntity;

public interface IFacade {

    DTOEntity convertToDto(DomainEntity entity);
    DomainEntity convertToEntity(DTOEntity dto);

}
