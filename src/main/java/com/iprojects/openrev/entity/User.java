package com.iprojects.openrev.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surName")
    private String surName;

    @Column(name = "age")
    private String age;

    @Column(name = "userName")
    private boolean userName;

    @Column(name = "email")
    private boolean email;

    @Column(name = "password")
    private boolean password;

    public User(){

    }
}
