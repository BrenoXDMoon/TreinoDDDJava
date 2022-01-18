package com.example.TreinoDDD.mapper;

import com.example.TreinoDDD.dto.UserDTO;
import com.example.TreinoDDD.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper mapper = Mappers.getMapper(UserMapper.class);

//    @Mapping()
//    UserDTO userToUserDto(User user) ;

}
