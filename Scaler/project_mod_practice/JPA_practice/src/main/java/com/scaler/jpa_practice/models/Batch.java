package com.scaler.jpa_practice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Batch extends BaseModel{
    private String batch_time;
}
