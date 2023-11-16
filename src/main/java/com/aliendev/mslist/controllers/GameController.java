package com.aliendev.mslist.controllers;

import com.aliendev.mslist.dtos.GameDTO;
import com.aliendev.mslist.dtos.GameMinDTO;
import com.aliendev.mslist.entities.Game;
import com.aliendev.mslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping("{id}")
    public GameDTO findOne(@PathVariable Long id) {
        return gameService.findOne(id);
    }
}
