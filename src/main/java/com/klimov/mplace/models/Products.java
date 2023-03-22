package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    @ManyToOne
    @JoinColumn(name = "sellers_id",nullable = false)
    private Sellers sellers;
    @Column(nullable = false)
    private String name;
    private String description;
    private Long price;
    private Integer quantity;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private Categories categories;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;


}
