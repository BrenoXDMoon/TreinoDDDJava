package com.example.TreinoDDD.facade;

import com.example.TreinoDDD.dto.AudithoryDTO;
import com.example.TreinoDDD.dto.DTOEntity;
import com.example.TreinoDDD.dto.UserDTO;
import com.example.TreinoDDD.entity.Audithory;
import com.example.TreinoDDD.entity.DomainEntity;
import com.example.TreinoDDD.entity.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Facade implements IFacade{

    Map<String, DomainEntity> entities;
    Map<String, DTOEntity> dtos;

    public Facade(){
        entities = new HashMap<String, DomainEntity>();
        dtos = new HashMap<String, DTOEntity>();

        entities.put(UserDTO.class.getName(), new User());
        entities.put(AudithoryDTO.class.getName(), new Audithory());

        dtos.put(User.class.getName(), new UserDTO());
        dtos.put(Audithory.class.getName(), new AudithoryDTO());
    }

    @Override
    public DTOEntity convertToDto(DomainEntity dto) {

        return entities.get(dto).convertToDto();
    }

    @Override
    public DomainEntity convertToEntity(DTOEntity dto) {
        return dtos.get(dto).convertToEntity();
    }
}
