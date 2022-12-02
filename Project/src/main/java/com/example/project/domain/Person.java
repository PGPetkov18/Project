package com.example.project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@NoArgsConstructor
@Data
public class Person {
    @Id
    @GeneratedValue
    private int Id;
    private String lastname;
    private String name;
    private String surname;
    private String birthday;


}
