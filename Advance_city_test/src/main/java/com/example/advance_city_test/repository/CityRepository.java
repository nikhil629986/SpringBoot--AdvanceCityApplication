package com.example.advance_city_test.repository;

import com.example.advance_city_test.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {
    public List<City> findByName(String name);

    public List<City> findByPopulationGreaterThan(int population);


}
