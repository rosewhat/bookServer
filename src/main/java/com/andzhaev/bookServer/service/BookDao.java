package com.andzhaev.bookServer.service;

import com.andzhaev.bookServer.models.Book;
import com.andzhaev.bookServer.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookDao {

    @Autowired
    private BookRepository repository;

    public void save(Book book) {
        repository.save(book);
    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(books::add);
        return books;
    }

    public void delete(Book book) {
        repository.delete(book);
    }

    public List<Book> getBooksByTextBooks(Long textBooks) {
        return repository.findByTextBooks(textBooks);
    }
    public List<Book> getBooksGenre(String genre) {
        return repository.findByGenre(genre);
    }
}
