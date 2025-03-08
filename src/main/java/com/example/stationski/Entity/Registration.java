package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numWeek;
    @ManyToOne(optional = false)
    private Skier skier;

    @ManyToOne(optional = false)
    private Course course;
}
