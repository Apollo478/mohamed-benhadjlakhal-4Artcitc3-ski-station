package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private Date dateOfBirth;
    @OneToOne(mappedBy = "skier", optional = false)
    private Subscription subscription;
    @ManyToMany
    @JoinTable(
            name="skier_piste",
            joinColumns = @JoinColumn(name ="skier_id"),
            inverseJoinColumns = @JoinColumn(name="piste_id")
    )
    private List<Piste> pistes;
    @OneToMany(mappedBy = "skier",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Registration> registrations;


}
