package com.vinsaned.vslist.repositories;

import com.vinsaned.vslist.etities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
