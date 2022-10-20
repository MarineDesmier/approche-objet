package fr.diginamic.listes;

public enum Continent {

	AMERIQUE(1, "Amérique"),
	AFRIQUE(2, "Afrique"),
	ASIE(3, "Asie"),
	EUROPE(4, "Europe"),
	OCEANIE(5, "Océanie");
	
	private int numOrdre;
	private String libelle;
	
	/** Constructeur
	 * @param numOrdre
	 * @param libelle
	 * @author :Marine Desmier
	 */
	private Continent(int numOrdre, String libelle) {
		this.numOrdre = numOrdre;
		this.libelle = libelle;
	}

	
	/**
	 * Getter pour l'attribut numOrdre 
	 * @return the numOrdre
	 */
	public int getNumOrdre() {
		return numOrdre;
	}

	/**
	 * Getter pour l'attribut libelle 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	
	
}
