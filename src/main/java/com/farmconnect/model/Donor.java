package com.farmconnect.model;

import jakarta.persistence.*;

// This tells JPA that this is an entity mapped to a table
@Entity
@Table(name = "donors")
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    private String name;

    private String bloodGroup;

    private int age;

    private String contactNumber;

    private String city;

    // Default constructor (required by JPA)
    public Donor() {
    }

    // Constructor with fields (optional)
    public Donor(String name, String bloodGroup, int age, String contactNumber, String city) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.contactNumber = contactNumber;
        this.city = city;
    }

    // Getters and setters
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
