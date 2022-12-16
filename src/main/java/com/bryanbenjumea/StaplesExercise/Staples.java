package com.bryanbenjumea.StaplesExercise;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STAPLES")
public class Staples {
    @Id
    @Column(name = "id")
    int id;
    @Column(name = "description")
    String description;

    protected Staples() {
    }

    public Staples(int id, String description){
        this.id = id;
        this.description=description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
