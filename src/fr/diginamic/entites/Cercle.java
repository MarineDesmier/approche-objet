package fr.diginamic.entites;

public class Cercle {
	
	private double rayon;

	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	// Créez une méthode qui retourne le périmètre du cercle
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}
	
	// Créez une méthode qui retourne la surface du cercle
	public double surface() {
		return 2 * rayon * rayon;
	}
	
	public String toString() {
		return "Le rayon est de " + rayon + " le périmètre est de " + perimetre() + " et la surface est de " + surface();
	}
	
	
}
