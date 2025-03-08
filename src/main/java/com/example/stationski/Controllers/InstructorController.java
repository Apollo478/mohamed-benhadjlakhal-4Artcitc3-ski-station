package com.example.stationski.Controllers;

import com.example.stationski.Entity.Instructor;
import com.example.stationski.Entity.Piste;
import com.example.stationski.Services.InstructorService;
import com.example.stationski.Services.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("instructor")
@RestController
public class InstructorController {

    private final InstructorService instructorService ;
    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService=instructorService;
    }
    @PostMapping("add")
    public void addInstructor(@RequestBody Instructor instructor){
        instructorService.addInstructor(instructor);
    }
    @PutMapping("update")
    public ResponseEntity<String> updateInstructor(@RequestBody Instructor instructor){
        instructorService.updateInstructor(instructor);
        return ResponseEntity.ok("Instructor updated");
    }
    @GetMapping("retrieve/{id}")
    public ResponseEntity<Instructor> retrieveInstructor(@PathVariable long id){
        Instructor instructor = instructorService.retrieveInstructor(id);
        return ResponseEntity.ok(instructor);
    }
    @GetMapping("retrieve")
    public ResponseEntity<List<Instructor>> retrieveAllInstructor(){
        var instructors = instructorService.retrieveAllInstructor();
        return ResponseEntity.ok(instructors);
    }
}
