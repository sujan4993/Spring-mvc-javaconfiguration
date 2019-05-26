package com.course;
import com.sujan.Studeent;
import com.sujan.StudeentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    private List<Studeent> list = new ArrayList<>(Arrays.asList(
            new Studeent("1","Ram","Pokharel","Bharatpur"),
            new Studeent("2","Shyam","koirala","Pokhara"),
            new Studeent("3","Hari","Thapa","Kathmandu"),
            new Studeent("4","Bharat","poudel","Dang"),
            new Studeent("5","Bijay","gurung","ktm"),
            new Studeent("6","Aashish","Acharaya","hetauda"),
            new Studeent("7","iTS","Working","In my computer")

    ));

    public List<Course> getAllCourse(String id){

//        return list;
        List<Course> courses = new ArrayList<>();
        repository.findAll()
                .forEach(courses::add);
         return courses;
    }

    public Course getCourse(String  id){

       // return (list.stream().filter(s->s.getId().equals(id)).findFirst().get());
         return repository.findById(id).orElse(null);
    }



    public void addCourse(Course course) {
        //list.add(studeent);
        repository.save(course);
    }

    public void updateCourse(String id, Course course) {

//        for(int i=0;i<list.size();i++){
//            Studeent s=list.get(i);
//            if(s.getId().equals(id)){
//                list.set(i, studeent);
//                return;
//            }
//        }

        repository.save(course);
    }
    public void deleteCourse(String id) {
        //list.removeIf(s->s.getId().equals(id));
        repository.deleteById(id);

    }
}
