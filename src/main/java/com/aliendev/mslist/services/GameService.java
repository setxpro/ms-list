package com.aliendev.mslist.services;

import com.aliendev.mslist.dtos.GameDTO;
import com.aliendev.mslist.dtos.GameMinDTO;
import com.aliendev.mslist.entities.Game;
import com.aliendev.mslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// Register a component in my system. -- nickname - of the @Component - @Service.
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    // Assegurando que eu não vou fazer alguma operação de escrita.. fazendo que fique mais rápido
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
    //  List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }

    // Assegurando que eu não vou fazer alguma operação de escrita.. fazendo que fique mais rápido
    @Transactional(readOnly = true)
    public GameDTO findOne(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
//        return gameRepository.findById(id);
    }

}
