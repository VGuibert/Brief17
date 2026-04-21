package com.example.jpalibrary.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Lob
    private String description;
    @Column( columnDefinition = "BOOLEAN DEFAULT true")
    private Boolean available;
    @ManyToOne
    private Category category;
    @ManyToMany
    private List<Author> author;
}
