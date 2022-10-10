package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne perso1 = new Personne("DESMIER", "Marine", new AdressePostale(91, "rue Rambuteau", 71000, "Mâcon"));
		
		
		AdressePostale adresse2 = new AdressePostale(594, "Chemin de la grande gibode", 01140, "Saint didier sur Chalaronne");
		Personne perso2 = new Personne("DESMIER", "Sansa", adresse2);
		
		
	}

}
