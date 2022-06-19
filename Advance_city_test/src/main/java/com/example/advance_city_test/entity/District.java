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

public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "district",cascade = CascadeType.ALL)
    private List<City> cities;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
            (
                    name="fk_officials",referencedColumnName = "id"
            )
    private  DistrictOffcials offcials;

}
