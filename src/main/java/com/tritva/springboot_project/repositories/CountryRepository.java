package com.tritva.springboot_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tritva.springboot_project.entities.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    Country findById(int id);
    
}
