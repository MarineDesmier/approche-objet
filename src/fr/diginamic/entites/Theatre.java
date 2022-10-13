package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int capaMaxPers; 
	private int cltInscrit;
	private double recette;
	private int totalInscrit;
	
	/**
	 * @param nom
	 * @param capaMaxPers
	 * @param nbTotalClt
	 * @param recette
	 */
	public Theatre(String nom, int capaMaxPers) {
		super();
		this.nom = nom;
		this.capaMaxPers = capaMaxPers;
//		this.cltInscrit = nbTotalClt;
//		this.recette = recette;
	}
	
	// méthode inscrire/réservation
	public void inscrire(int nbClient, double prixPlace) {
		if(nbClient + totalInscrit <= capaMaxPers) {
			totalInscrit = nbClient + this.totalInscrit;
			recette = recette + nbClient * prixPlace;	
			 
		}else{
			System.err.println("Le plafond de réservation est atteint !!!");
		}
	}
	
	public String toString() {
		return "Théatre : " + nom + " -> capacité  maxi : " + capaMaxPers + " -> nombre client inscrit : " +
	cltInscrit + " -> recette : " + recette + " €"; 
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCapaMaxPers() {
		return capaMaxPers;
	}
	public void setCapaMaxPers(int capaMaxPers) {
		this.capaMaxPers = capaMaxPers;
	}
	public int getNbTotalClt() {
		return cltInscrit;
	}
	public void setNbTotalClt(int nbTotalClt) {
		this.cltInscrit = nbTotalClt;
	}
	public double getRecette() {
		return recette;
	}
	public void setRecette(double recette) {
		this.recette = recette;
	}
	
}
