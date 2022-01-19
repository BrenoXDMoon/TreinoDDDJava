package com.example.TreinoDDD.service.impl;

import com.example.TreinoDDD.entity.Audithory;
import com.example.TreinoDDD.entity.User;
import com.example.TreinoDDD.facade.dto.UserDTO;
import com.example.TreinoDDD.repositories.UserRepository;
import com.example.TreinoDDD.service.IAudithoryService;
import com.example.TreinoDDD.service.IUserService;
import com.example.TreinoDDD.strategy.ValidateUserLastName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private IAudithoryService audithoryService;

    @Autowired
    private ValidateUserLastName validateUserLastName;

    @Override
    public User save(User user) {

        validateUserLastName.process(user);
        user.setActive(true);
        repository.saveAndFlush(user);
        audithoryService.save(new Audithory("Registro de Usuário", user));

        return user;
    }

    @Override
    public User edit(User user) {

        validateUserLastName.process(user);
        repository.saveAndFlush(user);
        audithoryService.save(new Audithory("Atualização de Registro de Usuário", user));

        return user;
    }

    @Override
    public User delete(User user) {

        user.setActive(false);
        repository.saveAndFlush(user);
        audithoryService.save(new Audithory("Exclusão de Registro de Usuário", user));
        return user;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).get();
    }
}
