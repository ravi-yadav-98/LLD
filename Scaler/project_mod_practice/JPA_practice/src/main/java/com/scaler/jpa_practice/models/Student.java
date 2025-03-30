package com.scaler.jpa_practice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends BaseModel{

    private String email;
    private double psp;
    private  float attendance;
    @ManyToOne
    private Batch batch;

}

/*
Student  --> Batch
1        :    1
m         :    1

Cardinality : m:1
 */
