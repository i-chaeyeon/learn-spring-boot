package com.in28minutes.springboot.learn_spring_boot;

// create a simple REST API with URL/courses
// when somebody hits the URL, return this data ...

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    // /courses
    @RequestMapping("/courses")
    // Course: id, name, author
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DevOps", "in28minutes"),
                new Course(3, "Learn Azure", "in28minutes"),
                new Course(4, "Learn GCP", "in28minutes"),
                new Course(4, "Learn Spring Boot", "in28minutes")
        );
    }
}
