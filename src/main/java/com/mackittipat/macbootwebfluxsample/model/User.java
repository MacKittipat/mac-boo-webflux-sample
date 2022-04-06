package com.mackittipat.macbootwebfluxsample.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
@Data
public class User {

    @Id
    private int id;
    private String name;
    private String email;
}
