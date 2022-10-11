package entites;

public class TestPassageParReference {

	public static void main(String[] args) {
		Compteur cpt1 = new Compteur();
		cpt1.inc();
		cpt1.inc();
		cpt1.inc();
		
		System.out.println(cpt1.getValeur());

		
		AdressePostale adr1 = new AdressePostale(91, "rue Rambuteau", 71000, "Mâcon");
		
		AdressePostale adr2 = new AdressePostale(594, "Chemin de la grande gibode", 01140, "Saint didier sur Chalaronne");
		
		
		AdressePostale adr3 = adr2; // ne créé pas de copie
		adr3.setVille("Pérols");
		
		System.out.println(adr2.getVille());
		System.out.println(adr3.getVille());
	}

}
