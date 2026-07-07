package com.shimano.guilherme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shimano.guilherme.model.Partida;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
