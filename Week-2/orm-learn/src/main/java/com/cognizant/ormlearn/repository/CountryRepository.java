package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Search countries containing text
    List<Country> findByNameContainingIgnoreCase(String text);

    // Search countries containing text and sort by name
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String text);

    // Countries starting with a letter
    List<Country> findByNameStartingWithIgnoreCase(String alphabet);
}