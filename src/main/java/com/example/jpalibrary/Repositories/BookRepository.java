package com.example.jpalibrary.Repositories;

import com.example.jpalibrary.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    Book findBooksById(Long id);
}
