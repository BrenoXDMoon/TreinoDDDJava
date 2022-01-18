package com.example.TreinoDDD.controller;

import com.example.TreinoDDD.dto.UserDTO;
import com.example.TreinoDDD.facade.IFacade;
import com.example.TreinoDDD.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService service;

    @Autowired
    private IFacade facade;

    @GetMapping
    public List<UserDTO> findAll(){

        List<UserDTO> result = new ArrayList<UserDTO>();

        service.findAll().stream().forEach(u -> result.add( (UserDTO) u.convertToDto()));

        return result;
    }

    @PostMapping
    public UserDTO save(UserDTO user) {
        return (UserDTO) facade.convertToDto(service.save(user));
    }

    @PutMapping
    public UserDTO edit(UserDTO user) {
        return (UserDTO) facade.convertToDto(service.edit(user));
    }

    @GetMapping("{id}")
    public UserDTO findById(@PathVariable("id") Long id) {
        return (UserDTO) facade.convertToDto(service.findById(id));
    }

    @DeleteMapping
    public void delete(UserDTO user) {
        service.remove(user);
    }
}
