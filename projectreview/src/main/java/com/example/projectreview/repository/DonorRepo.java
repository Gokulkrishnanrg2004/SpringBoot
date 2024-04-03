package com.example.projectreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectreview.model.Donor;

public interface DonorRepo extends JpaRepository<Donor,Integer>{
    
}
