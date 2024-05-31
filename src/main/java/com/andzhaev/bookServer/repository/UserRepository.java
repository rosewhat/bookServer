package com.andzhaev.bookServer.repository;

import com.andzhaev.bookServer.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
    Users findByEmail(String email);
}