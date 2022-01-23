package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Address implements Serializable {

    private Integer id;
    private String country;
    private String city;

    public Address(Integer id, String country, String city) {
        this.id = id;
        this.country = country;
        this.city = city;
    }
}
