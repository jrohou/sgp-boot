package dev.sgpboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sgpboot.entite.Collaborateur;
import dev.sgpboot.repository.CollaborateurRepository;
import dev.sgpboot.repository.DepartementRepository;
import dev.sgpboot.repository.PosteRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/collaborateurs")
public class CollaborateurController {
	
	@Autowired CollaborateurRepository listeCollaborateur;
	@Autowired DepartementRepository listeDepartement;
	@Autowired PosteRepository listePoste;
	
	@PostMapping
	public Collaborateur creerCollaborateur(@RequestBody Collaborateur collab) {
		listeCollaborateur.save(collab);
		return collab;
		
	}
	
	@GetMapping (path="/lister")
	public List<Collaborateur> listerCollaborateur() {
		
		return this.listeCollaborateur.findAll();
		
	}

}
