package entites;

public class Voiture {
	
	String modele;
	String nom;
	
	public Voiture(String modele, String nom) {
		super();
		this.modele = modele;
		this.nom = nom;
	}
	
	public void demarrer() {
		System.out.println("Je démarre ma "+modele+" "+nom);
		mettreLeContact();
	}
	
	public void mettreLeContact() {
		System.out.println("Je mets le contact");
	}
}
