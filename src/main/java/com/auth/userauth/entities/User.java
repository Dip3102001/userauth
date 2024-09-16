package com.auth.userauth.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="users")
@Entity
public class User {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable=false)
    private Integer id;
    
    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String password;

    @Column(unique=true, length=32, nullable=false)
    private String email; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
