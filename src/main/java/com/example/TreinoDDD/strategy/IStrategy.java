package com.example.TreinoDDD.strategy;

import com.example.TreinoDDD.entity.DomainEntity;

public interface IStrategy {

    Object process(DomainEntity entity);

}
