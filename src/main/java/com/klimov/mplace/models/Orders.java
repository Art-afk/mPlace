package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usersID",nullable = false)
    private Users users;
    private String status;
    private BigDecimal totalPrice;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

}
