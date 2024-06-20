package com.tritva.springboot_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tritva.springboot_project.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{
    
}
