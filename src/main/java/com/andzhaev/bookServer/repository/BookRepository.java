package com.andzhaev.bookServer.repository;

import com.andzhaev.bookServer.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    List<Book> findByTextBooks(Long textBooks);
    List<Book> findByGenre(String genre);

}

