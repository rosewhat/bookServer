package com.andzhaev.bookServer.service;

import com.andzhaev.bookServer.models.Talon;
import com.andzhaev.bookServer.repository.TalonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TalonDao {

    @Autowired
    private TalonRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(TalonDao.class);

    public void save(Talon talon) {
        repository.save(talon);
    }

    public List<Talon> getAllTalons() {
        List<Talon> talons = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(talons::add);
        return talons;
    }

    public void deleteByNumber(Long number) {
        Talon talon = repository.findByNumber(number);
        if (talon != null) {
            logger.info("Deleting talon with number: " + number);
            repository.delete(talon);
        } else {
            logger.warn("Talon with number " + number + " not found");
        }
    }
}
