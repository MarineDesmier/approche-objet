package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne perso1 = new Personne("Desmier", "Marine", new AdressePostale(91, "rue Rambuteau", 71000, "Mâcon"));
		
		
		AdressePostale adresse2 = new AdressePostale(594, "Chemin de la grande gibode", 01140, "Saint didier sur Chalaronne");
		Personne perso2 = new Personne("Desmier", "Sansa", adresse2);
		
		Personne perso3 = new Personne("Everdeen", "Katniss", adresse2);
		
		perso3.PersonneMaj();
		
		perso3.setNom("Petit");
		perso3.setPrenom("Léa");
		
		perso3.PersonneMaj();
		
		
		String nom = perso3.getNom(); 
		System.out.println(nom);
	}

}
