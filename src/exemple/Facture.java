package exemple;

public class Facture {
	
	private double consommationKwh;
	private double montant;
	
	private static double coutKwh = 0.15;
	
	public Facture(double consommationKwh) {
		this.consommationKwh = consommationKwh;
	
	// Cette formule est un besoin exprimé par le client
	recalculerMontant();
	
	}
	
	private void recalculerMontant() {
		this.montant = consommationKwh * coutKwh;
	}

	public void modifierConsommation(double nvConsommation) {
		this.consommationKwh = nvConsommation;
		this.montant = nvConsommation * 0.15;
	}
	
	private void recalculerFacture(double nvConsommation) {
		// Je modifie la conso
		this.consommationKwh = nvConsommation;
		
		// Je recalcule le montant
		recalculerMontant();
	}
	
	public double getConsommationKwh() {
		return consommationKwh;
	}

	public void setConsommationKwh(double consommationKwh) {
		this.consommationKwh = consommationKwh;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public static double getCoutKwh() {
		return coutKwh;
	}

	public static void setCoutKwh(double coutKwh) {
		Facture.coutKwh = coutKwh;
	}
	
	

}
