package com.sujan;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> list = new ArrayList<>(Arrays.asList(
            new Student("1","Ram","Pokharel","Bharatpur"),
            new Student("2","Shyam","koirala","Pokhara"),
            new Student("3","Hari","Thapa","Kathmandu"),
            new Student("4","Bharat","poudel","Dang"),
            new Student("5","Bijay","gurung","ktm"),
            new Student("6","Aashish","Acharaya","hetauda")
            ));

    public List<Student> getAllStudent(){

        return list;
    }

    public Student getStudent(String  id){

        return (list.stream().filter(s->s.getId().equals(id)).findFirst().get());

    }



    public void addStudent(Student student) {
        list.add(student);
    }

    public void updateStudent(String id, Student student) {

     for(int i=0;i<list.size();i++){
         Student s=list.get(i);
         if(s.getId().equals(id)){
             list.set(i,student);
             return;
         }
     }
    }
    public void deleteStudent(String id) {
       list.removeIf(s->s.getId().equals(id));


    }
}
