package fr.diginamic.listes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> listeNb = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5);

		// affiche tout les éléments
		System.out.println("La liste de nombre est : " + listeNb);

		// affiche la taille de la liste
		System.out.println("La taille de la liste est de : " + listeNb.size());

		// recherche et affiche le plus grand nombre de la liste

		Iterator<Integer> nombreListe = listeNb.iterator();
		
		int valeurMax = 0;
		while (nombreListe.hasNext()) {
			Integer nombre = nombreListe.next();
			if (nombre > valeurMax) {
				valeurMax = nombre;
			}
		}
		System.out.println("La valeur max est " + valeurMax);
		System.out.println("------------------------------------- ");

		// supprimer le plus petit
		Iterator<Integer> petitNbListe = listeNb.iterator();
			int valeurMini = 0;
			while(petitNbListe.hasNext()) {
				Integer mini = petitNbListe.next();
				if(mini < valeurMini) {
//					petitNbListe.remove();
				}
				System.out.println("La nouvelle liste est : " + listeNb);
			}
			
		
			
	}
}
