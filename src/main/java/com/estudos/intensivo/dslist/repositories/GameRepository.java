package com.estudos.intensivo.dslist.repositories;

import com.estudos.intensivo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game , Long> {
}
