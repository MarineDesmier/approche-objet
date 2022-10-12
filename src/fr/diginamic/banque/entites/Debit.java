package fr.diginamic.banque.entites;

public class Debit extends Operation {
	
	/**
	 * @param dateOpe
	 * @param montant
	 */
	public Debit(String dateOpe, double montant) {
		super(dateOpe, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "Débit";
	}
	
	public double OpeCalcul() {
		return getMontant();
	}
}
