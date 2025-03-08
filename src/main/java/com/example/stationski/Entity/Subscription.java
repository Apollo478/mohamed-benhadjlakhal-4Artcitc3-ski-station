package com.example.stationski.Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
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
    private Skier skier;
}
