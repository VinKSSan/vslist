package com.vinsaned.vslist.service;

import com.vinsaned.vslist.dto.GameDto;
import com.vinsaned.vslist.dto.GameMinDto;
import com.vinsaned.vslist.etities.Game;
import com.vinsaned.vslist.projections.GameMinProjection;
import com.vinsaned.vslist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public GameDto findById(Long id){
        Game game = gameRepository.findById(id).get();
        return new GameDto(game);
    }

    @Transactional
    public List<GameMinDto> findAll(){
        List <Game> games = gameRepository.findAll();
        return games.stream()
                .map(GameMinDto::new)
                .toList();
    }

    @Transactional
    public List<GameMinDto> findByList(Long listId){
        List<GameMinProjection> listProjection = gameRepository.searchByList(listId);
        return listProjection.stream().map(GameMinDto::new).toList();
    }

}
