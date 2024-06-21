package com.tritva.springboot_project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tritva.springboot_project.entities.City;
import com.tritva.springboot_project.entities.Country;
import com.tritva.springboot_project.pojos.CityRequest;
import com.tritva.springboot_project.repositories.CityRepository;
import com.tritva.springboot_project.repositories.CountryRepository;

@Service
public class CityService {

    @Autowired CityRepository cityRepository;
    @Autowired CountryRepository countryRepository;

    public CityService(){
    }

    public List<City> getCities(){
        return cityRepository.findAll();

    }

    public City saveCity(City city){
        return cityRepository.save(city);
    }

    public City getCity(String cityname){
        return cityRepository.findByCityname(cityname);
    }

    public City addcity(CityRequest cityRequest) {
        Country country =countryRepository.findById(cityRequest.country_id);

        City city =new City();

        city.setCityname(cityRequest.cityname);
        city.setCitycode(cityRequest.citycode);
        city.setCountry(country);

        return cityRepository.save(city);
    }

   

    
}
