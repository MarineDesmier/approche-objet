package entites2;

import entites.AdressePostale;

public class Personne {

	// Personne a des variables d'instances
	private String nom;
	private String prenom;
	private AdressePostale adressePers; // = new AdressePostale();

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adressePers) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePers = adressePers;
	}

	public void PersonneMaj() {

		System.out.println(nom.toUpperCase() + " " + prenom);
	}

	// méthode qui retourne le nom
	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public AdressePostale getAdresse() {
		return this.adressePers;
	}
	

	public void setNom(String nvNom) {
		this.nom = nvNom;
	}

	public void setPrenom(String nvPrenom) {
		this.prenom = nvPrenom;
	}

	public void setAdresse(AdressePostale nvAdresse) {
		this.adressePers = nvAdresse;
	}

}
