package fr.diginamic.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CreationEtManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// afficher toute les clés de la map
		Set<Integer> keys = mapVilles.keySet();
		for (Integer cp : keys) {
			System.out.println(cp);
		}

		System.out.println("------------------------------------");
		
		//Récupérer l'ensemble des valeurs
		
		Collection<String> villes = mapVilles.values();
		Iterator<String> iter = villes.iterator();
		while (iter.hasNext()) {
			String v = iter.next();
			System.out.println("Ville de " + v);
			//System.out.println("Ville de " + v + " -> cp : " + cp);
			
		}
		
		// Récupérer la taille de la map
		System.out.println("La taille de la map est de " + mapVilles.size() + " éléments");
	}

}
