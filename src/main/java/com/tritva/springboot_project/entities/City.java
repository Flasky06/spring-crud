package com.tritva.springboot_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cities")
public class City {

    @Id
    @Column(name="city_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="city_name")
    private String cityname;

    @Column(name="citycode",columnDefinition="character varying(255) not null default 'NA'")
    private String citycode;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
}
