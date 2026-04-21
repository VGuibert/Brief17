package com.example.jpalibrary.Services;

import com.example.jpalibrary.Model.Book;
import com.example.jpalibrary.Repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findBooksById(id);
    }

    public Book getBookByTitle(String title) { return bookRepository.findBookByTitle(title);}

    public Book postBook(Book newBook) {
        if(newBook.getAvailable() == null){
            newBook.setAvailable(true);
        }
        return bookRepository.save(newBook);
    }

    public Book saveModifiedBook(Book newBook, Long id) {
        return bookRepository.findById(id)
                .map(book -> {
                    book.setDescription(newBook.getDescription());
                    book.setTitle(newBook.getTitle());
                    book.setAvailable(newBook.getAvailable());
                    return bookRepository.save(book);
                })
                .orElseGet(() -> {
                    return bookRepository.save(newBook);
                });
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
