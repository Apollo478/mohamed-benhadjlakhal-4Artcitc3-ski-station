package com.example.stationski.Controllers;

import com.example.stationski.Entity.Piste;
import com.example.stationski.Entity.Skier;
import com.example.stationski.Services.SkierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("skier")
@RestController
public class SkierController {
    private final SkierService skierService ;

    public SkierController(SkierService skierService) {
        this.skierService = skierService;
    }

    @PostMapping("add")
    public void addSkier(@RequestBody Skier skier){
        skierService.addSkier(skier);
    }
    @PutMapping("update")
    public ResponseEntity<String> updateSkier(@RequestBody Skier skier){
        skierService.updateSkier(skier);
        return ResponseEntity.ok("Skier updated");
    }
    @GetMapping("retrieve/{id}")
    public ResponseEntity<Skier> retrieveSkier(@PathVariable long id){
        Skier skier = skierService.retrieveSkier(id);
        return ResponseEntity.ok(skier);
    }
    @GetMapping("retrieve")
    public ResponseEntity<List<Skier>> retrieveAllSkier(){
        var skiers = skierService.retrieveAllSkier();
        return ResponseEntity.ok(skiers);
    }
}
