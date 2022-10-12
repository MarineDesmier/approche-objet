package fr.diginamic.banque.entites;

public abstract class Compte {

	private int numero;
	private double solde;
	
	public Compte(int numeroCompte, double soldeCompte) {
		super();
		this.numero = numeroCompte;
		this.solde = soldeCompte;
	}
	
	public abstract void afficherInfos();
	
	// méthode toString
	public String toString() {
		return "Numéro de compte : "+numero+ " "+ "Ton solde est de "+solde+" €";
	}
	
	public double getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	
}
