package com.example.projectreview.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.projectreview.model.Donor;

public interface DonorRepo extends JpaRepository<Donor,Integer>{
    @Query("SELECT d from Donor d WHERE d.petBreed = :petBreed")
    List<Donor>findByPetBreed(@Param("petBreed") String petBreed);
}
