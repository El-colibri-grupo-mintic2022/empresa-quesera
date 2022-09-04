package com.Elcolibri.Controlador.financiero.Model;

import java.time.LocalDateTime;
import java.util.List;


public class User  {
    private long id;

    private String email;

    private Profile profile;

    private Enum_RoleName role;

    private Enterprise enterprise;

    private List<Transaction> transaction;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public User(long id, String email, Profile profile, Enum_RoleName role, Enterprise enterprise, List<Transaction> transaction, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.transaction = transaction;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}