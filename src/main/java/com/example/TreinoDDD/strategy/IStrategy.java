package com.example.TreinoDDD.strategy;

import com.example.TreinoDDD.dto.DTOEntity;

public interface IStrategy {

    Object process(DTOEntity entity);

}
