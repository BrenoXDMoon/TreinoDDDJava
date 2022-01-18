package com.example.TreinoDDD.controller;

import com.example.TreinoDDD.dto.AudithoryDTO;
import com.example.TreinoDDD.service.IAudithoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("audith")
public class AudithoryController {

    @Autowired
    private IAudithoryService service;

    @GetMapping
    public List<AudithoryDTO> getAudithories(){

        List<AudithoryDTO> audithories = new ArrayList<AudithoryDTO>();

         service.findAll().stream().forEach(a -> audithories.add((AudithoryDTO) a.convertToDto()));

        return audithories;
    }

    @GetMapping("{id}")
    public AudithoryDTO getAudithoriesByID(Long id){
        return (AudithoryDTO) service.findById(id).convertToDto();
    }
}
