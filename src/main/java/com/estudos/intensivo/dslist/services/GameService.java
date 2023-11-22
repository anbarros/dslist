package com.estudos.intensivo.dslist.services;

import com.estudos.intensivo.dslist.dto.GameMinDTO;
import com.estudos.intensivo.dslist.entities.Game;
import com.estudos.intensivo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
   @Autowired
    GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
