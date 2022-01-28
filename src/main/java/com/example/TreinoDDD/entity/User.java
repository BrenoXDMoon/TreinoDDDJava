package com.example.TreinoDDD.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends DomainEntity{

    private String firstName;
    private String lastName;
    private String email;

}
