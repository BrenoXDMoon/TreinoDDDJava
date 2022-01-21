package com.example.TreinoDDD.entity;

import javax.persistence.Entity;

@Entity
public class User extends DomainEntity{
    private String firstName;
    private String lastName;
    private String email;

    public User() {

    }

    public User(String firstName, String lastName, String email) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public User(Long id, String firstName, String lastName, String email) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
