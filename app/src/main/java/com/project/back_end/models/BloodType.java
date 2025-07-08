package com.project.back_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class BloodType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Blood code is required")
    @Column(nullable = false)
    private String code;

    // constructors
    public BloodType() {}

    public BloodType(String code) {
        this.code = code;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}