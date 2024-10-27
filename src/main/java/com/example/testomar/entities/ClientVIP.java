package com.example.testomar.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClientVIP extends Client{
    private String code;
    public ClientVIP(String id, String name, String code) {
        super(id, name);
        this.code = code;
    }

}
