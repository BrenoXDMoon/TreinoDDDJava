package com.example.TreinoDDD.service.impl;

import com.example.TreinoDDD.entity.Audithory;
import com.example.TreinoDDD.repositories.AuditoryRepository;
import com.example.TreinoDDD.service.IAudithoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudithoryService implements IAudithoryService {

    @Autowired
    private AuditoryRepository repository;

    @Override
    public void save(Audithory audithory) {
        repository.saveAndFlush(audithory);
    }

    @Override
    public void edit(Audithory audithory) {
        repository.saveAndFlush(audithory);
    }

    @Override
    public void delete(Audithory audithory) {
        repository.delete(audithory);
    }

    @Override
    public List<Audithory> findAll() {
        return repository.findAll();
    }

    @Override
    public Audithory findById(Long id) {
        return repository.findById(id).get();
    }
}
