package entites2;

import entites.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adressePers; //= new AdressePostale();
	
	public Personne(String nom, String prenom, AdressePostale adressePers) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePers = adressePers;
	}
}
