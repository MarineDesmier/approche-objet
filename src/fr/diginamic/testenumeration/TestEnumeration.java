package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		// afficher toute les saisons
		Saison[] saisons = Saison.values();
		for(Saison saison : saisons) {
			System.out.println(saison.getNom());
		}
		
		// utiliser la méthode pour afficher le libellé de l'instance ETE
		Saison saisonEte = Saison.ETE;
		System.out.println("La saison est : " + saisonEte.getNom() + " et son code : " + saisonEte.getNumOrdre());
		
		String nom = "ETE";
		Saison saison = Saison.valueOf(nom);
		System.out.println(saison.getNom());
		
		// Soit la chaine de caractères suivante : 
		String libelle =  "Hiver";
		
		Saison saisonHiver = Saison.valeurDuLibelle(libelle);
		System.out.println(saisonHiver);
	}

}
