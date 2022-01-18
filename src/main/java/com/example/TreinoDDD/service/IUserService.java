package com.example.TreinoDDD.service;

import com.example.TreinoDDD.dto.UserDTO;
import com.example.TreinoDDD.entity.DomainEntity;
import com.example.TreinoDDD.entity.User;

import java.util.List;

public interface IUserService {

    User save(UserDTO dto);
    User edit(UserDTO dto);
    void remove(UserDTO dto);
    List<User> findAll();
    User findById(Long id);
}
