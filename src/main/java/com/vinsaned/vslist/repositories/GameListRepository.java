package com.vinsaned.vslist.repositories;

import com.vinsaned.vslist.etities.Game;
import com.vinsaned.vslist.etities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
