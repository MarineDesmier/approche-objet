package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	private double tauxRemuneration;

	public CompteTaux(int numeroCompte, double soldeCompte, double tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public void afficherInfos() {
		// TODO Auto-generated method stub
		
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public String toString() {
		String chaineVal = super.toString(); 
		return chaineVal + " à un taux de "+ tauxRemuneration+"%";
	}


	
	
}
