package com.andzhaev.bookServer.repository;

import com.andzhaev.bookServer.models.Book;
import com.andzhaev.bookServer.models.Favorite;
import com.andzhaev.bookServer.models.Talon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteRepository extends CrudRepository<Favorite, Integer> {
    Favorite findByTitle(String title);  // Correct method name
}
