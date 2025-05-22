package com.vinsaned.vslist.service;

import com.vinsaned.vslist.dto.GameMinDto;
import com.vinsaned.vslist.etities.Game;
import com.vinsaned.vslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
        List <Game> games = gameRepository.findAll();
        return games.stream()
                .map(GameMinDto::new)
                .toList();
    }
}
