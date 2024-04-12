package com.example.projectreview.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(mappedBy = "donor",cascade = CascadeType.ALL)
    // @JoinColumn(name = "details_id")
    @JsonManagedReference
    private Details details;
    private String donorName;
    private String donorArea;
    private String petName;
    private String petBreed;
    private String petAge;
    private String donorProof;
    private String license;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDonorName() {
        return donorName;
    }
    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }
    public String getDonorArea() {
        return donorArea;
    }
    public void setDonorArea(String donorArea) {
        this.donorArea = donorArea;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getPetBreed() {
        return petBreed;
    }
    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }
    public String getPetAge() {
        return petAge;
    }
    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }
    public String getDonorProof() {
        return donorProof;
    }
    public void setDonorProof(String donorProof) {
        this.donorProof = donorProof;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    
    public Details getDetails() {
        return details;
    }
    public void setDetails(Details details) {
        this.details = details;
    }
    
    public Donor() {
    }
    public Donor(int id, String donorName, String donorArea, String petName, String petBreed, String petAge,
            String donorProof, String license,Details details) {
        this.id = id;
        this.donorName = donorName;
        this.donorArea = donorArea;
        this.petName = petName;
        this.petBreed = petBreed;
        this.petAge = petAge;
        this.donorProof = donorProof;
        this.license = license;
        this.details = details;
    }
    // public Details getDetails() {
    //     return details;
    // }
    // public void setDetails(Details details) {
    //     this.details = details;
    // }
    
}
