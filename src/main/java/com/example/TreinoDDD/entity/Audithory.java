package com.example.TreinoDDD.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audithory extends DomainEntity{

    private String operationName;
    @ManyToOne
    @JoinColumn(name = "operation_user_ID")
    private User operationUser;

}
