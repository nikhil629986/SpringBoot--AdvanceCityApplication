package com.example.advance_city_test.controller;

import com.example.advance_city_test.dto.CityDto;
import com.example.advance_city_test.entity.City;
import com.example.advance_city_test.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllControllers {
    @Autowired
    private CityService cityService;
    @GetMapping("/largeCities")
    @ResponseBody
    public List<CityDto> getlargeCities()
    {
       return cityService.getALLlargeCities();
    }
}
