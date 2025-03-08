package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private Date dateOfHire;
    @OneToMany(mappedBy = "instructor",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Course> courses;

}
