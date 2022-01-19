package com.example.TreinoDDD.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Password extends DomainEntity{

    private String password;
    @Transient
    private String confirmPassword;

}
