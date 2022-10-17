package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {

	public static void main(String[] args) {
		
		HashMap<String, Integer> mapVilles2 = new HashMap<>();
		mapVilles2.put("Carcassonne", 47800);
		mapVilles2.put("Nice",343000);
		mapVilles2.put("Lyon", 484000);
		mapVilles2.put("Foix", 9700);
		mapVilles2.put("Pau", 77200);
		mapVilles2.put("Marseille", 850700);
		mapVilles2.put("Tarbes", 40600);
	
		System.out.println(mapVilles2);
		
		Iterator<String> iterVille = mapVilles2.keySet().iterator();
		int nbHabitant = Integer.MAX_VALUE;
		String villeMini = null;
		while(iterVille.hasNext()) {
			String villes = iterVille.next();
			Integer cpVille = mapVilles2.get(villes);
			if(cpVille < nbHabitant) {
				nbHabitant = cpVille;
				villeMini = villes;
			}
		}
		System.out.println("La ville la moins peuplé est " + villeMini);
		
		mapVilles2.remove(villeMini);
		
		System.out.println("Liste après remove -> " + mapVilles2);
		
	}
}
