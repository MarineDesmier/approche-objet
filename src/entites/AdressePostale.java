package entites;

public class AdressePostale {

	// variable d'instance
	private int numeroRue;
	private String libelleRue;
	private int codePostal;
	public String ville;
	
	// variable de classe
	public static String pays = "FRANCE";
	
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		super();
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	// une methode static ne peut accèder qu'aux variables et methodes static
//	public static void afficherAdresse() {
//		System.out.println(numeroRue+ " "+ libelleRue);
//	}
	
	public static String getPays() {
		return pays;
	}
	
	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
