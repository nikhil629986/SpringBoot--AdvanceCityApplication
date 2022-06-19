package com.example.advance_city_test;


import com.example.advance_city_test.entity.City;
import com.example.advance_city_test.entity.District;
import com.example.advance_city_test.entity.DistrictOffcials;
import com.example.advance_city_test.entity.Person;
import com.example.advance_city_test.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class AdvanceCityTestApplication implements CommandLineRunner {
@Autowired
private CityRepository cityRepository;
    public static void main(String[] args) {
        SpringApplication.run(AdvanceCityTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Person person=new Person();
//        person.setName();
       Person person = Person.builder()
                .name("Nikhil")
                .build();
        DistrictOffcials offcials=DistrictOffcials.builder()
                .dm("Ashish")
                .sp("Aaryan")
                .build();
        District district=District.builder()
                .name("Puri")
                .offcials(offcials)
                .build();
        City city= City.builder()
                .name("BBSR")
                .population(80000)
                .district(district)

                .citizen(Collections.singletonList(person))
                .build();

        cityRepository.save(city);
        List<City> cities =cityRepository.findByName("BBSR");
            if(!cities.isEmpty())
            {
                System.out.println(cities.get(0).getPopulation());
            }


    }
}
