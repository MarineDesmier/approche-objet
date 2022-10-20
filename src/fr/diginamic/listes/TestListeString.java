package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// instanciez une ArrayList de String contenant les éléments suivants
		ArrayList<String> villes = new ArrayList<>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");

		// Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		int max = 0;
		String resultat = null;
		
		for(int i = 0; i < villes.size(); i++) {
			String nomVille = villes.get(i);
			//System.out.println(nomVille.length());
			if(nomVille.length() > max) {
				max = nomVille.length();
				resultat = nomVille;
			}
		}
		System.out.println("Le ville avec le plus grand nombre de lettre est " + resultat);
		
		// Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules
		for(int i = 0; i < villes.size(); i++) {
			String villeMaj = villes.get(i).toUpperCase();
			System.out.println(villeMaj);
		}
		
		// Supprimez de la liste les villes dont le nom commence par la lettre N
		Iterator<String> iterator = villes.iterator();
		while (iterator.hasNext()) {
		// .startsWith -> permet de vérifier si la chaine commence par le ou les caractères spécifiés
			if(iterator.next().startsWith("N")) { 
				iterator.remove();
			}
		}
		System.out.println("\nListe après suppression ");
		
		for(int i = 0; i < villes.size(); i++) {
			System.out.println(villes.get(i));
		}
	}

}
