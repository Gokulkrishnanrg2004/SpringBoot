package com.example.projectreview.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JsonBackReference
    private Donor donor;

    private String firstName;
    private String lastName;
    private String dob;
    private String profession;
    public Details() {
    }
    public Details(int id, Donor donor, String firstName, String lastName, String dob, String profession) {
        this.id = id;
        this.donor = donor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.profession = profession;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Donor getDonor() {
        return donor;
    }
    public void setDonor(Donor newdet) {
        this.donor = newdet;
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
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    

}
