package com.course;

import com.sujan.Studeent;
import com.sujan.StudeentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("Students/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){

        return service.getAllCourse(id);
    }
    @GetMapping("/Courses/{id}")
    public Course getCourse(@PathVariable String id){

        return service.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/Students")
    public void addCourse(@RequestBody Course course){
        service.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/Students/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id){
        service.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/Students/{id}")
    public void deleteCourse(@PathVariable String id){
        service.deleteCourse(id);
    }


}
