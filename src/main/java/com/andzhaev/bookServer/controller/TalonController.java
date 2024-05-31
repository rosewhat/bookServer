package com.andzhaev.bookServer.controller;

import com.andzhaev.bookServer.models.Talon;
import com.andzhaev.bookServer.service.TalonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TalonController {

    @Autowired
    private TalonDao talonDao;

    private static final Logger logger = LoggerFactory.getLogger(TalonController.class);

    @GetMapping("/book/talons")
    public List<Talon> getAppTalons() {
        return talonDao.getAllTalons();
    }

    @PostMapping("/book/talon/save")
    public void save(@RequestBody Talon talon) {
        talonDao.save(talon);
    }

    @PostMapping("/book/talon/delete")
    public void delete(@RequestParam Long number) {
        logger.info("Received request to delete talon with number: " + number);
        talonDao.deleteByNumber(number);
    }
}