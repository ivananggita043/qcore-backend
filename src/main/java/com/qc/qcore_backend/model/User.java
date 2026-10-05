package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "username", unique = true, nullable = false, length = 50)
    private String username;

    @Column(name = "password_hash", nullable = false, length = 255)
    private String passwordHash;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    // Menggunakan String untuk menghindari error mapping spasi pada 'super admin'
    @Column(name = "role", nullable = false)
    private String role = "user";

    @Column(name = "assigned_line", length = 20)
    private String assignedLine;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;
}