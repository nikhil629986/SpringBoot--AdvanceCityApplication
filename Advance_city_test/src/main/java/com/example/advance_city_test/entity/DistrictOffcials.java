package com.example.advance_city_test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DistrictOffcials {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String dm;
    private String sp;

    @OneToOne(mappedBy = "offcials",cascade = CascadeType.ALL)

    private District district;
}
