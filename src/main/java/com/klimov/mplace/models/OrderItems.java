package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderItemId")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "orderId",nullable = false)
    private Orders order;
    @ManyToOne
    @JoinColumn(name ="productID", nullable = false)
    private Products product;
    private Integer quantity;
    private BigDecimal price;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
