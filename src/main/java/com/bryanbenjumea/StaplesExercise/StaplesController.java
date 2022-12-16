package com.bryanbenjumea.StaplesExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class StaplesController {
    @Autowired
    StaplesRepository staplesRepository;


    // route that returns all the Staples entities
    @GetMapping("/get/all")
    public List<Staples> getList(){
        // since findAll return an iterable, we create a list and populate it with the entities
        List<Staples> list = new ArrayList<>();
        staplesRepository.findAll().forEach(list::add);
        // return populated list
        return list;
    }

    // get specific user route
    @GetMapping("/get/{id}")
    public Staples getUser(@PathVariable int id){
        return staplesRepository.findById(id);
    }
}
