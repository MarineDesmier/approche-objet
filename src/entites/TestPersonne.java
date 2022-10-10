package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne perso1 = new Personne("DESMIER", "Marine", new AdressePostale(91, "rue Rambuteau", 71000, "Mâcon"));
		perso1.nom = "DESMIER";
		perso1.prenom = "Marine";
//		perso1.adresse.numeroRue = 91;
//		perso1.adresse.libelleRue = "rue Rambuteau";
//		perso1.adresse.codePostal = 71000;
//		perso1.adresse.ville = "Mâcon";
		
		Personne perso2 = new Personne("DESMIER", "Sansa", new AdressePostale(91, "rue Rambuteau", 71000, "Mâcon"));
		perso2.nom = "DESMIER";
		perso2.prenom = "Sansa";
//		perso2.adresse.numeroRue = 91;
//		perso2.adresse.libelleRue = "rue Rambuteau";
//		perso2.adresse.codePostal = 71000;
//		perso2.adresse.ville = "Mâcon";
		
	}

}
