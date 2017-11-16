package dev.sgpboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sgpboot.entite.Poste;

public interface PosteRepository extends JpaRepository <Poste, Integer> {

}
