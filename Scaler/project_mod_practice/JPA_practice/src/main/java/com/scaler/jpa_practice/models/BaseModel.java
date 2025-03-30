package com.scaler.jpa_practice.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    private  Long id;
    private  String name;
}
