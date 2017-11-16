package dev.sgpboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sgpboot.entite.Departement;

public interface DepartementRepository extends JpaRepository <Departement, Integer> {

}
