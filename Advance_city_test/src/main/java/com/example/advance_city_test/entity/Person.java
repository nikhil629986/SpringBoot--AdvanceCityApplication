package com.example.advance_city_test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    @ManyToMany(mappedBy = "citizen",cascade = CascadeType.ALL)
    private List<City> cities;

}
