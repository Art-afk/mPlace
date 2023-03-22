package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class OrderAddresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderAddressId")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Orders order;
    @ManyToOne
    @JoinColumn(name = "addressId", nullable = false)
    private Addresses address;
    private String addressType; //'billing' 'shipping'
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;



}
