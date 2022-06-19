package com.example.advance_city_test.service;

import com.example.advance_city_test.dto.CityDto;
import com.example.advance_city_test.entity.City;
import com.example.advance_city_test.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public List<CityDto> getALLlargeCities()
    {
        List<CityDto> dtos=new ArrayList<>();
        for(City city:cityRepository.findByPopulationGreaterThan(5000))

        {
            CityDto dto=new CityDto(city.getName(),city.getPopulation(),city.getDistrict().getName());
          dtos.add(dto);
        }
return dtos;
    }
}
