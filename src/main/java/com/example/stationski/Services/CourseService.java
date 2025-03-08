package com.example.stationski.Services;

import com.example.stationski.Entity.Course;
import com.example.stationski.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {


    private final CourseRepository courseRepository;
    @Autowired
    public CourseService( CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Course> retrieveAllCourse() {
        return courseRepository.findAll();
    }
    public Course addCourse(Course piste) {
        return courseRepository.save(piste);
    }
    public Course updateCourse(Course piste) {
        return courseRepository.save(piste);
    }
    public Course retrieveCourse(long id) {
        return courseRepository.findById(id).orElse(null);
    }
}
