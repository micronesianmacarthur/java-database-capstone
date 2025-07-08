package com.project.back_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Role name is required")
    @Column(nullable = false)
    private String name;

}