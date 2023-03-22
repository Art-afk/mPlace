package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
public class Addresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="addressID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private Users user;
    private Integer phone;
    private String googleId;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

}
