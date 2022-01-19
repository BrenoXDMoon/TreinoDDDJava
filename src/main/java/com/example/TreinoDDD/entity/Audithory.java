package com.example.TreinoDDD.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
public class Audithory extends DomainEntity{

    private String operationName;
    @ManyToOne
    @JoinColumn(name = "operation_user_ID")
    private User operationUser;

    public Audithory() {

    }

    public Audithory(String operationName, User operationUser) {
        this.operationName = operationName;
        this.operationUser = operationUser;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public User getOperationUser() {
        return operationUser;
    }

    public void setOperationUser(User operationUser) {
        this.operationUser = operationUser;
    }
}
