package com.example.advance_city_test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int population;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(
        name="fk_district",referencedColumnName = "id"
)
    private District district;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(
        name="person_city_mapping",
        joinColumns =@JoinColumn(name ="city_id",referencedColumnName = "id")
)
    private List<Person> citizen;

}
