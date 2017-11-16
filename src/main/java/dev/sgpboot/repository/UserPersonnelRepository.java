package dev.sgpboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sgpboot.entite.UserPersonnel;

public interface UserPersonnelRepository extends JpaRepository <UserPersonnel, Integer> {

}
