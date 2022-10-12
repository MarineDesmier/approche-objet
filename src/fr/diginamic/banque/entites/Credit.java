package fr.diginamic.banque.entites;

public class Credit extends Operation {
	
	/**
	 * @param dateOpe
	 * @param montant
	 */
	public Credit(String dateOpe, double montant) {
		super(dateOpe, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "Crédit";
	}
	
	public double OpeCalcul() {
		return getMontant();
		
	}
}
