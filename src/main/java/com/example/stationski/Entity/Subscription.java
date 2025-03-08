package com.example.stationski.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Entity
@Data
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date startDate;
    private Date endDate;
    private float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSubscription;
    @OneToOne
    @JoinColumn(name="skier_id",nullable = false,unique = true)
    @JsonBackReference
    @ToString.Exclude
    private Skier skier;
}
