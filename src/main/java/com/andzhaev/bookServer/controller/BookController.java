package com.andzhaev.bookServer.controller;


import com.andzhaev.bookServer.models.Book;
import com.andzhaev.bookServer.service.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookDao bookDao;

    @GetMapping("/book/get-all")
    public List<Book> getAppBooks() {
        return bookDao.getAllBooks();
    }

    @PostMapping("/book/save")
    public void save(@RequestBody Book book) {
        bookDao.save(book);
    }

    @GetMapping("/book/get-by-textbooks")
    public List<Book> getBooks(@RequestParam(value = "textBooks", required = false) Long textBooks,
                               @RequestParam(value = "genre", required = false) String genre) {
        if (textBooks != null && genre == null) {
            return bookDao.getBooksByTextBooks(textBooks);
        } else if (genre != null && textBooks == null) {
            return bookDao.getBooksGenre(genre);
        } else {
            throw new IllegalArgumentException("You must provide either 'textBooks' or 'genre', but not both.");
        }
    }

}
