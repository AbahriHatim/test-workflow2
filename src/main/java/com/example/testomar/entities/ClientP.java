package com.example.testomar.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClientP extends Client{
    private Date date;
    public ClientP(String id, String name, Date date) {
        super(id, name);
        this.date = date;
    }
}
