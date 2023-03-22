package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
public class Sellers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "User_id",nullable = false)
    private Users users;
    @Column(nullable = false)
    private String storeName;
    private String email;
    private String address;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
    private String description;
}
