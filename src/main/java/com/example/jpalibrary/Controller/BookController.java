package com.example.jpalibrary.Controller;

import com.example.jpalibrary.Model.Book;
import com.example.jpalibrary.Services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book newBook) {
        return bookService.postBook(newBook);
    }

    @PutMapping("/{id}")
    public Book saveModifiedBook(@RequestBody Book newBook, @PathVariable Long id) {
        return bookService.saveModifiedBook(newBook, id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }


}
