package fr.diginamic.listes;

public class VilleList {
	private String nom;
	private int nbHabitant;
	private Continent continent;
	
	/** Constructeur
	 * @param nom
	 * @param nbHabitant
	 * @param continent
	 */
	public VilleList(String nom, int nbHabitant, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}
	
	@Override
	public String toString() {
		return "Ville de " + nom + ", nombre d'habitant = " + nbHabitant + ", et son contient est " + continent;
	}

	@Override
	public boolean equals(Object obj) {
		// Si obj n'est pas une Ville je retourne directement false
		if(!(obj instanceof VilleList)) {
			return false;
		}
		// Si on arrive ici, on sait que obj est une Ville
		VilleList autre = (VilleList) obj; // on convertit obj en Ville via cast
		//test l'agalité
		return autre.getNom().equals(this.getNom()) && autre.getNbHabitant() == this.getNbHabitant();
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/**
	 * Getter pour l'attribut continent 
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * Setter pour l'attribut continent
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	
}
