package com.example.stationski.Controllers;

import com.example.stationski.Entity.Skier;
import com.example.stationski.Services.SkierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("skier")
@RestController
public class SkierController {
    private final SkierService skierService ;

    public SkierController(SkierService skierService) {
        this.skierService = skierService;
    }

    @PostMapping("add")
    public Skier addSkier(@RequestBody Skier skier){
        return skierService.saveSkier(skier);
    }
}
