package com.example.stationski.Controllers;

import com.example.stationski.Entity.Piste;
import com.example.stationski.Repositories.PisteRepository;
import com.example.stationski.Services.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("piste")
@RestController
public class PisteController {
    private final PisteService pisteService ;
    @Autowired
    public PisteController(PisteService pisteService) {
        this.pisteService=pisteService;
    }
    @PostMapping("add")
    public void addPiste(@RequestBody Piste piste){
        pisteService.addPiste(piste);
    }
    @PutMapping("update")
    public ResponseEntity<String> updatePiste(@RequestBody Piste piste){
        pisteService.updatePiste(piste);
        return ResponseEntity.ok("Piste updated");
    }
    @GetMapping("retrieve/{id}")
    public ResponseEntity<Piste> retrievePiste(@PathVariable long id){
        Piste piste = pisteService.retrievePiste(id);
        return ResponseEntity.ok(piste);
    }
    @GetMapping("retrieve")
    public ResponseEntity<List<Piste>> retrieveAllPiste(){
        var pistes = pisteService.retrieveAllPiste();
        return ResponseEntity.ok(pistes);
    }
}
