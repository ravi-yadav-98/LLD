package com.scaler.jpa_practice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Instructor extends BaseModel {
    private String email;
    private float avg_rating;

}
