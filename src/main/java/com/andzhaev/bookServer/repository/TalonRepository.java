package com.andzhaev.bookServer.repository;

import com.andzhaev.bookServer.models.Talon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalonRepository extends CrudRepository<Talon, Long> {
    Talon findByNumber(Long number);

}
