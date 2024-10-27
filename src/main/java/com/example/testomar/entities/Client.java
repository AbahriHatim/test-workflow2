package com.example.testomar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",length = 4,discriminatorType = DiscriminatorType.STRING)
@Data @AllArgsConstructor @Entity @NoArgsConstructor
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private  String id;
    private  String name;

}
