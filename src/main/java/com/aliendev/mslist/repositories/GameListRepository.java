package com.aliendev.mslist.repositories;

import com.aliendev.mslist.entities.GameList;
import com.aliendev.mslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
