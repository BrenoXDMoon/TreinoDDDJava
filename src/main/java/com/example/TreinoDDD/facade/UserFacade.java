package com.example.TreinoDDD.facade;

import com.example.TreinoDDD.entity.User;
import com.example.TreinoDDD.facade.dto.UserDTO;
import com.example.TreinoDDD.facade.mapper.UserMapper;
import com.example.TreinoDDD.service.IAudithoryService;
import com.example.TreinoDDD.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class UserFacade implements IUserFacade {

    @Autowired
    IUserService service;

    @Autowired
    IAudithoryService audithoryService;

    private final UserMapper userMapper;

    public UserFacade(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO save(UserDTO dto){
        User user = userMapper.covertToUser(dto);
        service.save(user);
        return userMapper.convertToDto(user);
    }

    @Override
    public UserDTO edit(Long id, UserDTO dto) {

        User user = userMapper.covertToUser(dto);
        user.setId(service.findById(id).getId());
        return userMapper.convertToDto(service.edit(user));
    }

    @Override
    public UserDTO findUserById(Long id) {
        return userMapper.convertToDto(service.findById(id));
    }

    @Override
    public Page<UserDTO> getAllUsers(Pageable pageable) {
        return service.findAll(pageable).map(userMapper::convertToDto);
    }

    @Override
    public UserDTO delete(Long id) {
        return userMapper.convertToDto(service.delete(service.findById(id)));
    }
}
