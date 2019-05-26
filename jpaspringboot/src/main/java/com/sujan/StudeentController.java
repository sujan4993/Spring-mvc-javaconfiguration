package com.sujan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudeentController {

    @Autowired
    private StudeentService service;

    @GetMapping("/Students")
    public List<Studeent> getAllStudents(){

        return service.getAllStudent();
    }
    @GetMapping("/Students/{id}")
    public Studeent getStudent(@PathVariable String id){

        return service.getStudent(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/Students")
    public void addStudent(@RequestBody Studeent studeent){
        service.addStudent(studeent);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/Students/{id}")
    public void updateStudent(@RequestBody Studeent studeent, @PathVariable String id){
        service.updateStudent(id, studeent);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/Students/{id}")
    public void deleteStudent(@PathVariable String id){
        service.deleteStudent(id);
    }


}
