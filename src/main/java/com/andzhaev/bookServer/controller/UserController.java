package com.andzhaev.bookServer.controller;

import com.andzhaev.bookServer.models.Users;
import com.andzhaev.bookServer.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/get-all")
    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }

    @PostMapping("/user/save")
    public void save(@RequestBody Users user) {
        userDao.save(user);
    }
}
