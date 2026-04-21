package com.example.jpalibrary.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categorie")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
