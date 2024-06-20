package com.tritva.springboot_project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tritva.springboot_project.entities.City;
import com.tritva.springboot_project.services.CityService;





// endpoints
@RestController
public class HomeController {

    @Autowired
    CityService cityService;

    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello bony";
    }
    // Get all cities
    @GetMapping("getcities")
    public List<City> getCities(){
        return cityService.getCities();
    }
    // Create new city or update existing city
    @PostMapping("addcity")
    public City SaveCity(@RequestBody City city){
        return cityService.saveCity(city);
    }
    
    @GetMapping("getcity")
    public City getCity(String cityname) {
        return cityService.getCity(cityname);
    }
    
}
