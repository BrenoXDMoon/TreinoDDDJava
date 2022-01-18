package com.example.TreinoDDD.service;

import com.example.TreinoDDD.entity.Audithory;

import java.util.List;

public interface IAudithoryService {
    void save(Audithory audithory);
    void edit(Audithory audithory);
    void delete(Audithory audithory);
    List<Audithory> findAll();
    Audithory findById(Long id);
}
