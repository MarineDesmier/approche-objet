package fr.diginamic.listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<VilleList> villes = new ArrayList<>();
		villes.add(new VilleList("New York", 8804190, Continent.AMERIQUE));
		villes.add(new VilleList("Paris", 2175601, Continent.EUROPE));
		villes.add(new VilleList("Pékin", 21893095, Continent.ASIE));
		villes.add(new VilleList("Moscou", 12655050, Continent.ASIE));
		villes.add(new VilleList("Berlin", 3748148, Continent.EUROPE));
		villes.add(new VilleList("Sydney", 5312163, Continent.OCEANIE));
		villes.add(new VilleList("Sao Paulo", 22430000, Continent.AMERIQUE));
		villes.add(new VilleList("Dakar", 1056009, Continent.AFRIQUE));
		
		// Réalisez une boucle qui affiche l’ensemble des villes avec leur continent respectif
		
		for(VilleList ville : villes) {
			System.out.println(ville);
		}
	}

}
