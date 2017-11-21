package dev.sgpboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sgpboot.entite.Departement;
import dev.sgpboot.repository.DepartementRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/departements")
public class DepartementController {

	@Autowired DepartementRepository listeDepartement;
	
	@GetMapping
	public List <Departement> listerDepartement() {
		
		return this.listeDepartement.findAll();
	}
}
