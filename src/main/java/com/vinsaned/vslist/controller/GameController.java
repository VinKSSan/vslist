package com.vinsaned.vslist.controller;

import com.vinsaned.vslist.dto.GameDto;
import com.vinsaned.vslist.dto.GameMinDto;
import com.vinsaned.vslist.etities.Game;
import com.vinsaned.vslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
