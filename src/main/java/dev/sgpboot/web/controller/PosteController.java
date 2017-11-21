package dev.sgpboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sgpboot.entite.Poste;
import dev.sgpboot.repository.PosteRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/postes")
public class PosteController {

	@Autowired PosteRepository listePoste;
	
	@GetMapping
	public List <Poste> listerPoste() {
		
		return this.listePoste.findAll();
	}
}
