package com.bryanbenjumea.StaplesExercise;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StaplesRepository extends CrudRepository<Staples, Integer> {

    List<Staples> findAll();
    Staples findById(int id);
}
