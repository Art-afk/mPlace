package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewId")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private Users users;
    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    private Products products;
    private Integer rating;
    private String comment;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
