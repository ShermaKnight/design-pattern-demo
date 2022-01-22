package org.example.builder;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private List<School> schools;
    private List<Address> addresses;
}
