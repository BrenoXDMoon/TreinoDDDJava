package com.example.TreinoDDD.service.impl;

import com.example.TreinoDDD.entity.Audithory;
import com.example.TreinoDDD.repositories.AudithoryRepository;
import com.example.TreinoDDD.service.IAudithoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudithoryService implements IAudithoryService {

    private AudithoryRepository repository;

    @Autowired
    public AudithoryService(AudithoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Audithory audithory) {
        repository.saveAndFlush(audithory);
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
