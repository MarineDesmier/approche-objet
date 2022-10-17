package fr.diginamic.maps;

public class User {
	private String nom;
	private int salaire;

	/**
	 * @param nom
	 * @param salaire
	 */
	public User(String nom, int salaire) {
		super();
		this.nom = nom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Nom = " + nom + ", salaire = " + salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

}
