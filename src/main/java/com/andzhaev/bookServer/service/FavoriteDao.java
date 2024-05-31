package com.andzhaev.bookServer.service;

import com.andzhaev.bookServer.models.Favorite;
import com.andzhaev.bookServer.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FavoriteDao {
    @Autowired
    private FavoriteRepository repository;

    public void save(Favorite favorite) {
        repository.save(favorite);
    }

    public List<Favorite> getAllFavorite() {
        List<Favorite> favorites = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(favorites::add);
        return favorites;
    }

    public void deleteByTitle(String title) {
        Favorite favorite = repository.findByTitle(title);
        if (favorite != null) {
            repository.delete(favorite);
        } else {

        }
    }

}
