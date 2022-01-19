package com.example.TreinoDDD.controller;

import com.example.TreinoDDD.facade.dto.UserDTO;
import com.example.TreinoDDD.facade.IUserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserFacade facade;

    @GetMapping
    public ResponseEntity<Page<UserDTO>> findAll(Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(facade.getAllUsers(pageable));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(facade.save(user));
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(facade.findUserById(id));
    }

    @PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<UserDTO> edit(@RequestBody UserDTO user, @PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(facade.edit(id, user));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<UserDTO> delete(@PathVariable("id") Long id) {
        facade.delete(id);

        return ResponseEntity.status(HttpStatus.OK).body(facade.delete(id));
    }
}
