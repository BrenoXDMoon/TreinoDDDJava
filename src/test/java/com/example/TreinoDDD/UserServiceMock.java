package com.example.TreinoDDD;

import com.example.TreinoDDD.entity.User;
import com.example.TreinoDDD.repositories.AudithoryRepository;
import com.example.TreinoDDD.repositories.UserRepository;
import com.example.TreinoDDD.service.impl.AudithoryService;
import com.example.TreinoDDD.service.impl.UserService;
import com.example.TreinoDDD.strategy.ValidateUserLastName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceMock {

    @Mock
    private UserRepository repository;

    @Mock
    private AudithoryRepository audithoryRepository;

    private ValidateUserLastName validateUserLastName;

    private AudithoryService audithoryService;

    private UserService service;

    private User user;


    @BeforeEach
    public void beforeEach(){

        MockitoAnnotations.openMocks(this);
        validateUserLastName = new ValidateUserLastName();
        user = new User("Breno", "Gaaabriel", "email.breno@email.com");
        audithoryService = new AudithoryService(audithoryRepository);
        service = new UserService(repository, audithoryService, validateUserLastName);
    }

    @Test
    public void registerAnUser(){
        Assertions.assertNotNull(service.save(user), "Objeto retornado é nulo");
    }

    @Test
    public void editAnUser(){
        user.setId(4L);
        Assertions.assertNotNull(service.edit(user), "Objeto retornado é nulo");
    }

    @Test
    public void removeAnUser(){
        user.setId(4L);
        Assertions.assertNotNull(service.edit(user), "Objeto retornado é nulo");
    }

}
