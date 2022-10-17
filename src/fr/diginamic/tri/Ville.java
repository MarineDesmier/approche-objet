package fr.diginamic.tri;


public class Ville implements Comparable<Ville>{
	private String nom;
	private int nbHabitant;

	
	/**
	 * @param nom
	 * @param nbHabitant
	 */
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	// comparable avec le nom des villes
	
//	@Override
//	public int compareTo(Ville o) {
//		 this.nom.compareTo(o.getNom());
//		
//	}
	
	@Override
	public String toString() {
		return "Nom = " + nom + ", nbHabitant = " + nbHabitant;
	}
	
	// comparable avec le nombre d'habitant
	@Override
	public int compareTo(Ville autre) {
		if(this.nbHabitant > autre.getNbHabitant()) {
			return 1;
		}
		else if(this.nbHabitant < autre.getNbHabitant()) {
			return -1;
		}else {
			return 0;
		}
		
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
	
}
