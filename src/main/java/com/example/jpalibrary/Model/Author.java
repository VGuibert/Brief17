package com.example.jpalibrary.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
}
