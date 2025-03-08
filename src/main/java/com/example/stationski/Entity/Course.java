package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int level;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float price;
    private int timeSlot;
    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Registration> registrations;
    @ManyToOne(optional = false)
    private Instructor instructor;

}
