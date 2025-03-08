package com.example.stationski.Services;

import com.example.stationski.Entity.Instructor;
import com.example.stationski.Entity.Piste;
import com.example.stationski.Repositories.InstructorRepository;
import com.example.stationski.Repositories.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;
    @Autowired
    public InstructorService( InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }
    public List<Instructor> retrieveAllInstructor() {
        return instructorRepository.findAll();
    }
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
    public Instructor retrieveInstructor(long id) {
        return instructorRepository.findById(id).orElse(null);
    }
}
