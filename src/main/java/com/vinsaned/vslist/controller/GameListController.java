package com.vinsaned.vslist.controller;

import com.vinsaned.vslist.dto.GameDto;
import com.vinsaned.vslist.dto.GameListDto;
import com.vinsaned.vslist.dto.GameMinDto;
import com.vinsaned.vslist.service.GameListService;
import com.vinsaned.vslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){
        return gameListService.findAll();
    }

}
