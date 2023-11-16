package com.aliendev.mslist.controllers;

import com.aliendev.mslist.dtos.GameListDTO;
import com.aliendev.mslist.dtos.GameMinDTO;
import com.aliendev.mslist.services.GameListService;
import com.aliendev.mslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{id}/games")
    public List<GameMinDTO> searchByListId(@PathVariable Long id) {
       return gameService.findProjection(id);
    }
}
