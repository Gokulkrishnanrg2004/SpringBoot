package com.example.donatorpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.donatorpage.model.Donor;

public interface DonorRepo extends JpaRepository<Donor,Integer>{
    
}
