package com.example.TreinoDDD.service;


import com.example.TreinoDDD.entity.User;
import com.example.TreinoDDD.facade.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {

    User save(User dto);
    User edit(User dto);
    User delete(User dto);
    Page<User> findAll(Pageable pageable);
    User findById(Long id);
}
