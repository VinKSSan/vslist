package com.vinsaned.vslist.service;

import com.vinsaned.vslist.dto.GameListDto;
import com.vinsaned.vslist.dto.GameMinDto;
import com.vinsaned.vslist.etities.GameList;
import com.vinsaned.vslist.repositories.GameListRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional
    public List<GameListDto> findAll(){
        List <GameList> games = gameListRepository.findAll();
        return games.stream()
                .map(GameListDto::new)
                .toList();
    }

}
