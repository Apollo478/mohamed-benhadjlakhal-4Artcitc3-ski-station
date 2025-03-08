package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long numPiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    private Color color;
    private int length;
    private int slope;

    @ManyToMany(mappedBy = "pistes")
    private Collection<Skier> skiers;

    public Collection<Skier> getSkiers() {
        return skiers;
    }

    public void setSkiers(Collection<Skier> skiers) {
        this.skiers = skiers;
    }
}
