package com.example.TreinoDDD.service.impl;

import com.example.TreinoDDD.dto.UserDTO;
import com.example.TreinoDDD.entity.User;
import com.example.TreinoDDD.facade.IFacade;
import com.example.TreinoDDD.repositories.UserRepository;
import com.example.TreinoDDD.service.IUserService;
import com.example.TreinoDDD.strategy.ValidateLastName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private IFacade facade;

    @Override
    public User save(UserDTO dto) {
        ValidateLastName vln = new ValidateLastName();
        vln.process(dto);
        return repository.saveAndFlush( (User) facade.convertToEntity(dto));
    }

    @Override
    public User edit(UserDTO dto) {
        ValidateLastName vln = new ValidateLastName();
        vln.process(dto);
        return repository.saveAndFlush( (User) facade.convertToEntity(dto));
    }

    @Override
    public void remove(UserDTO dto) {
         repository.delete( (User) facade.convertToEntity(dto));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).get();
    }
}
