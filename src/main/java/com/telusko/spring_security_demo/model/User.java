package com.telusko.spring_security_demo.model;


import jakarta.persistence.*;
import lombok.Data;
@Table(name = "users")
@Data
@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String username;
    private String password;



}
