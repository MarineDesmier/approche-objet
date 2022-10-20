package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS(1, "Printemps"),
	ETE(2, "Eté"),
	AUTOMNE(3, "Automne"),
	HIVER(4, "Hiver");
	
	private int numOrdre;
	private String nom;
	
	/** Constructeur
	 * @param numOrdre
	 * @param nom
	 * Marine Desmier
	 */
	private Saison(int numOrdre, String nom) {
		this.numOrdre = numOrdre;
		this.nom = nom;
	}

	/**
	 * Permet de retourner une instance en fonction du nom
	 * @param nom
	 * @return
	 */
	public static Saison valeurDuLibelle(String nom) {
		Saison[] saisons = Saison.values();
		for(Saison saison : saisons){
			if(saison.getNom().equals(nom)) {
				return saison;
			}
		}
		return null;
	}
	
	/**
	 * Getter pour l'attribut numOrdre 
	 * @return the numOrdre
	 */
	public int getNumOrdre() {
		return numOrdre;
	}

	/**
	 * Setter pour l'attribut numOrdre
	 * @param numOrdre the numOrdre to set
	 */
	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

	/**
	 * Getter pour l'attribut nom 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
