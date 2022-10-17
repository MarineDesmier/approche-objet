package fr.diginamic.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<String, User> map = new HashMap<>();
		map.put("a", new User("Paul", 1750));
		map.put("b", new User("Hicham", 1825));
		map.put("c", new User("Yu", 2250));
		map.put("d", new User("Ingrid", 2015));
		map.put("e", new User("Chantal", 2418));
		
		//Récupérer la taille de la map
		System.out.println("La taille de la map est de " + map.size() +" éléments");
		
		// Récupérer l'ensemble des clés
		Set<String> keys = map.keySet();
		for(String k : keys) {
			User u = map.get(k);
			System.out.println(k + " --> " + u);
		}
		
		// Récupération de l'ensemble des valeurs
		Collection<User> users = map.values();
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User u = iterator.next();
			System.out.println(u);
		}
	}
	
}
