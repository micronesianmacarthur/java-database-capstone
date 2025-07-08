package com.project.back_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class InsuranceCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Company name is required")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "Phone is required")
    @Column(nullable = false)
    private String phone;

    @NotNull(message = "Address is required")
    @Column(nullable = false)
    private String address;

    // constructor
    public InsuranceCompany() {}

    public InsuranceCompany(String name, String phone, String address {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}