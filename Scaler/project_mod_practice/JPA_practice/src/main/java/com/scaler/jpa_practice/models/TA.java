package com.scaler.jpa_practice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TA extends BaseModel{

    private String email;
    private int session_taken;
}
