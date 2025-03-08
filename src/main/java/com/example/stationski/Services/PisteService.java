package com.example.stationski.Services;

import com.example.stationski.Entity.Piste;
import com.example.stationski.Repositories.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteService {

    private final PisteRepository pisteRepository;
    @Autowired
    public PisteService( PisteRepository pisteRepository) {
        this.pisteRepository = pisteRepository;
    }
    public List<Piste> retrieveAllPiste() {
        return pisteRepository.findAll();
    }
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }
    public Piste retrievePiste(long id) {
        return pisteRepository.findById(id).orElse(null);
    }
}
