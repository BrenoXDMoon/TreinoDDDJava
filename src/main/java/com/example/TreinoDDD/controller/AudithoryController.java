package com.example.TreinoDDD.controller;

import com.example.TreinoDDD.facade.dto.AudithoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("audith")
public class AudithoryController {


    @GetMapping
    public List<AudithoryDTO> getAudithories(){

        List<AudithoryDTO> audithories = new ArrayList<AudithoryDTO>();


        return audithories;
    }

    @GetMapping("{id}")
    public AudithoryDTO getAudithoriesByID(Long id){
        return null;
    }
}
