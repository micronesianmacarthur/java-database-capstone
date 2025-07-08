package com.project.back_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import com.fasterxml.jackson.validation.JsonProperty;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "First name is required")
    @Size(min = 3, max = 50, message = "First name must be 3 to 50 characters long")
    @Column(length = 50, nullable = false)
    private String firstName;

    @NotNull(message = "Last name is required")
    @Size(min = 3, max = 50, message = "Last name must be 3 to 50 characters long")
    @Column(length = 50, nullable = false)
    private String lastName;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(nullable = false)
    private String email;

    @NotNull(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull(message = "Date of Birth is required")
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @NotNull(message = "Hospital number is required")
    @Column(nullable = false)
    private String hospitalNo;

    @NotNull(message = "Blood type is required")
    @ManyToOne
    @JoinColumn(name = "bloodType_id", nullable = false)
    private BloodType bloodType;

    @Column(nullable = false)
    private boolean active = true;

    @Column(nullable = false)
    private LocalDate createDate;

    @PrePersist
    protected void onCreate() {
        return LocalDate.now();
    }

    @NotNull
    @Column(nullable = false)
    private boolean insuranceCoverage;

    @ManyToOne
    @JoinColumn(name = "insuranceCompany_id")
    private InsuranceCompany insuranceCompany;

    // constructors
    public Patient() {}

    public Patient(String firstName, String lastName, String email,
                   String password, LocalDate dateOfBirth, String hospitalNo,
                   BloodType bloodType, boolean active, LocalDate createDate,
                   boolean insuranceCoverage, InsuranceCompany insuranceCompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.hospitalNo = hospitalNo;
        this.bloodType = bloodType;
        this.active = active;
        this.createDate = createDate;
        this.insuranceCoverage = insuranceCoverage;
        this.insuranceCompany = insuranceCompany;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }public
}

// @Entity annotation:
//    - Marks the class as a JPA entity, meaning it represents a table in the database.
//    - Required for persistence frameworks (e.g., Hibernate) to map the class to a database table.

// 1. 'id' field:
//    - Type: private Long
//    - Description:
//      - Represents the unique identifier for each patient.
//      - The @Id annotation marks it as the primary key.
//      - The @GeneratedValue(strategy = GenerationType.IDENTITY) annotation auto-generates the ID value when a new record is inserted into the database.

// 2. 'name' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's full name.
//      - The @NotNull annotation ensures that the patient's name is required.
//      - The @Size(min = 3, max = 100) annotation ensures that the name length is between 3 and 100 characters.
//      - Provides validation for correct input and user experience.


// 3. 'email' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's email address.
//      - The @NotNull annotation ensures that an email address must be provided.
//      - The @Email annotation validates that the email address follows a valid email format (e.g., patient@example.com).

// 4. 'password' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's password for login authentication.
//      - The @NotNull annotation ensures that a password must be provided.
//      - The @Size(min = 6) annotation ensures that the password must be at least 6 characters long.

// 5. 'phone' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's phone number.
//      - The @NotNull annotation ensures that a phone number must be provided.
//      - The @Pattern(regexp = "^[0-9]{10}$") annotation validates that the phone number must be exactly 10 digits long.

// 6. 'address' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's address.
//      - The @NotNull annotation ensures that the address must be provided.
//      - The @Size(max = 255) annotation ensures that the address does not exceed 255 characters in length, providing validation for the address input.


// 7. Getters and Setters:
//    - Standard getter and setter methods are provided for all fields: id, name, email, password, phone, and address.
//    - These methods allow access and modification of the fields of the Patient class.
