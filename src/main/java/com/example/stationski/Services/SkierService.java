package com.example.stationski.Services;

import com.example.stationski.Entity.Skier;
import com.example.stationski.Repositories.SkierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkierService {
   private final SkierRepository skierRepository ;
   @Autowired
   public SkierService(SkierRepository skierRepository) {
       this.skierRepository = skierRepository;
   }
    public List<Skier> getAllSkiers() {
        return skierRepository.findAll();
    }
    public Skier saveSkier(Skier skier){
        return skierRepository.save(skier);
    }
}
