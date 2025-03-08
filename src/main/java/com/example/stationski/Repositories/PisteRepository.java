package com.example.stationski.Repositories;

import com.example.stationski.Entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
}
