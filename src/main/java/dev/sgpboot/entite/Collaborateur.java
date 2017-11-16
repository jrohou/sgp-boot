package dev.sgpboot.entite;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

 @Entity
public class Collaborateur {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private boolean actif;
	private String photo;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String adresse;
	private String codePostal;
	private String ville;
	private Integer numeroSecuriteSociale;
	private Integer numeroTelephone;
	private String coordonneesBancaire;
	@ManyToOne
	@JoinColumn(name="POSTE_ID")
	private Poste poste;
	@ManyToOne
	@JoinColumn(name="DEPARTEMENT_ID")
	private Departement departement;
	
	
	public Collaborateur() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public boolean isActif() {
		return actif;
	}


	public void setActif(boolean actif) {
		this.actif = actif;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public Integer getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}


	public void setNumeroSecuriteSociale(Integer numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}


	public Integer getNumeroTelephone() {
		return numeroTelephone;
	}


	public void setNumeroTelephone(Integer numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}


	public String getCoordonneesBancaire() {
		return coordonneesBancaire;
	}


	public void setCoordonneesBancaire(String coordonneesBancaire) {
		this.coordonneesBancaire = coordonneesBancaire;
	}


	public Poste getPoste() {
		return poste;
	}


	public void setPoste(Poste poste) {
		this.poste = poste;
	}


	public Departement getDepartement() {
		return departement;
	}


	public void setDepartement(Departement departement) {
		this.departement = departement;
	}


}
