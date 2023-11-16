package com.aliendev.mslist.repositories;

import com.aliendev.mslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
