package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "GroupsUsers")
public class GroupsUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
