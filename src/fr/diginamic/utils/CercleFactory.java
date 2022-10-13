package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	// méthode double retourne cercle
	public static Cercle returnCercle(double rayon) {
		return new Cercle(rayon);
	}
	
}
