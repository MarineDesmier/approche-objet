package fr.diginamic.maps;

public class Ville {
	private String nom;
	private int cp;
	
	/**
	 * @param nom
	 * @param cp
	 */
	public Ville(String nom, int cp) {
		super();
		this.nom = nom;
		this.cp = cp;
	}
	
	@Override
	public String toString() {
		return "Ville de " + nom + ", cp = " + cp;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}

	
}
