package com.Minh.test_jpa.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Table(name = "users")
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String username;
private String password;
}
