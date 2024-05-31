package com.andzhaev.bookServer.controller;

import com.andzhaev.bookServer.models.Book;
import com.andzhaev.bookServer.models.Favorite;
import com.andzhaev.bookServer.service.BookDao;
import com.andzhaev.bookServer.service.FavoriteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FavoriteController {
    @Autowired
    private FavoriteDao favoriteDao;

    @GetMapping("/favorite/get-all")
    public List<Favorite> getAppFavorite() {
        return favoriteDao.getAllFavorite();
    }

    @PostMapping("favorite/save")
    public void save(@RequestBody Favorite favorite) {
        favoriteDao.save(favorite);
    }

    @PostMapping("favorite/delete")
    public void deleteFavoriteBook(@RequestParam String title) {
        favoriteDao.deleteByTitle(title);
    }
}
