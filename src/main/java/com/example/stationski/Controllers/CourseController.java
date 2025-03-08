package com.example.stationski.Controllers;

import com.example.stationski.Entity.Course;
import com.example.stationski.Entity.Piste;
import com.example.stationski.Services.CourseService;
import com.example.stationski.Services.PisteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("course")
@RestController
public class CourseController {

    private final CourseService courseService ;
    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService=courseService;
    }
    @PostMapping("add")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }
    @PutMapping("update")
    public ResponseEntity<String> updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
        return ResponseEntity.ok("Course updated");
    }
    @GetMapping("retrieve/{id}")
    public ResponseEntity<Course> retrieveCourse(@PathVariable long id){
        Course course = courseService.retrieveCourse(id);
        return ResponseEntity.ok(course);
    }
    @GetMapping("retrieve")
    public ResponseEntity<List<Course>> retrieveAllcourse(){
        var courses = courseService.retrieveAllCourse();
        return ResponseEntity.ok(courses);
    }
}
