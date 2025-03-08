package com.example.stationski.Repositories;

import com.example.stationski.Entity.Skier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkierRepository extends JpaRepository<Skier, Long> {
}
