package com.sujan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class StudeentService {
    @Autowired
    private StudeentRepository repository;

    private List<Studeent> list = new ArrayList<>(Arrays.asList(
            new Studeent("1","Ram","Pokharel","Bharatpur"),
            new Studeent("2","Shyam","koirala","Pokhara"),
            new Studeent("3","Hari","Thapa","Kathmandu"),
            new Studeent("4","Bharat","poudel","Dang"),
            new Studeent("5","Bijay","gurung","ktm"),
            new Studeent("6","Aashish","Acharaya","hetauda"),
            new Studeent("7","iTS","Working","In my computer")

    ));

    public List<Studeent> getAllStudent(){

//        return list;
        List<Studeent> studeents = new ArrayList<>();
        repository.findAll()
                .forEach(studeents::add);
         return studeents;
    }

    public Studeent getStudent(String  id){

       // return (list.stream().filter(s->s.getId().equals(id)).findFirst().get());
         return repository.findById(id).orElse(null);
    }



    public void addStudent(Studeent studeent) {
        //list.add(studeent);
        repository.save(studeent);
    }

    public void updateStudent(String id, Studeent studeent) {

//        for(int i=0;i<list.size();i++){
//            Studeent s=list.get(i);
//            if(s.getId().equals(id)){
//                list.set(i, studeent);
//                return;
//            }
//        }

        repository.save(studeent);
    }
    public void deleteStudent(String id) {
        //list.removeIf(s->s.getId().equals(id));
        repository.deleteById(id);

    }
}
