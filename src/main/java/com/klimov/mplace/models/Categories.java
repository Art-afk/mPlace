package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "sellersId",nullable = false)
    private Sellers seller;
    @Column(nullable = false)
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "parentId", nullable = false)
    private Categories parentId;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
