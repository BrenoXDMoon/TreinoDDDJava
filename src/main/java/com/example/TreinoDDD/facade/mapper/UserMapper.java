package com.example.TreinoDDD.facade.mapper;

import com.example.TreinoDDD.entity.User;
import com.example.TreinoDDD.facade.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    
    UserDTO convertToDto(User user);

    User covertToUser(UserDTO dto);
}
