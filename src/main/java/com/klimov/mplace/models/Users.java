package com.klimov.mplace.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "groupId",nullable = false)
    GroupsUsers groupsUsers;
    private Integer phone;
    private String google_id;
    private String first_name;
    private String last_name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    private String address;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    private String description;


    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreated_at() {
        return createdAt;
    }

    public void setCreated_at(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdated_at() {
        return updatedAt;
    }

    public void setUpdated_at(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getGoogle_id() {
        return google_id;
    }

    public void setGoogle_id(String google_id) {
        this.google_id = google_id;
    }

    public Users(Integer phone, String google_id, String first_name, String last_name, String password, String email, String address, LocalDateTime createdAt, LocalDateTime updatedAt, String description) {
        this.phone = phone;
        this.google_id = google_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
    }
}
