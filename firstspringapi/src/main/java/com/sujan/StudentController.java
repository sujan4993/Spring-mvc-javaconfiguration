package com.sujan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/Students")
    public List<Student> getAllStudents(){

        return service.getAllStudent();
    }
    @GetMapping("/Students/{id}")
    public Student getStudent(@PathVariable String id){

        return service.getStudent(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/Students")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/Students/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable String id){
        service.updateStudent(id,student);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/Students/{id}")
    public void deleteStudent(@PathVariable String id){
         service.deleteStudent(id);
    }


}
